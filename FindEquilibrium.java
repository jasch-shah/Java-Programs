/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class FindEquilibrium {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		    arr[i] = sc.nextInt();
		    
		    System.out.println(equilibrium(arr));
		}
		
		
	}
	
	static int equilibrium(int[] arr)
	{
	    int result = 0;
	    if(arr.length == 1)
	        return result+1;
	    
	    while(result < arr.length)
	    {
	        int sumLeft = 0;
	        int sumRight = 0;
	        for(int i=0;i<result;i++)
	        sumLeft += arr[i];
	        
	        for(int j = result+1;j<arr.length;j++)
	        sumRight += arr[j];
	        
	        if(sumLeft == sumRight)
	        return result+1;
	        
	        result++;
	    }
	    
	    return -1;
	    
	    
	}
}