/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ReducingWalls {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-- > 0)
		{
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[n];
		    int count = 0;
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    for(int i=0;i<n;i++)
		    {
		        do{
		            if(arr[i] > k){
		                arr[i] = arr[i] - k;
		                count++;
		            }
		        }
		        while(arr[i] > k);
		    }
		    System.out.println(count);
		    for(int i=0;i<n;i++)
		    	System.out.println("Array -->"+arr[i]);
		    
		}
	}
}