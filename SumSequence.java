/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class SumSequence {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int k = 0;k<n;k++)
		    arr[k] = sc.nextInt();
		    
		    int arr2[] = new int[n];
		    for(int j = 0;j<n;j++)
		    arr2[j] = arr[j];
		    
		    for(int i = 1;i<n;i++)
		    {
		        for(int j = 0;j<i;j++)
		        {
		            if(arr[j]<arr[i])
		            {
		                arr2[i] = Math.max(arr2[i],arr2[j]+arr[i]);
		            }
		        }
		    }
		    int max = Integer.MIN_VALUE;
		    for(int i = 0;i<n;i++)
		    max = Math.max(max,arr2[i]);
		    System.out.println(max);
		}
	}
}