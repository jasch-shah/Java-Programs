/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Geek {
	public static void main (String[] args) {
	
		//code
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int testcase = sc.nextInt();
		int sum;
		while(count < testcase){
		    sum = 0;
		    int n = sc.nextInt();
		    int arr[][] = new int[n][n];
		    int ar[] = new int[n];

		    for(int i = 0;i<n;i++){
		       for(int j = 0;j<n;j++){
		           arr[i][j] = sc.nextInt();
		       }
		       
		    }
		    for(int i = 0;i<n;i++)
		        ar[i] = sc.nextInt();
		  
		    for(int i = 0;i<n;i++)
		        sum += arr[i][i];
		 
		    int max = ar[0];
		    for(int i = 0;i<n;i++)
		        {
		            if(ar[i] > max)
		                max = ar[i];
		        }
		        
		        System.out.println(sum+" "+max);
		    sc.close()
		    count++;
		   
		}
	}
}