/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxPerimeter {
    
    static void maxPerimeter(int arr[], int n){
        int maxi = 0;
        for(int i = 0;i<n-2;i++){
            for(int j = i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];
                    //check whether a,b and c forms triangle or not
                    if(a < b+c && b < a+c && c < a+b){
                        //if forms triangle update value of max
                        maxi = Math.max(maxi,a+b+c);
                    }
                }
            }
        }
        
        if(maxi>0)
        {
            System.out.println(maxi);
        } else{
            System.out.println(-1);
        }
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int testcase;
		testcase = sc.nextInt();
		while(testcase-- > 0)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<arr.length;i++){
		        arr[i] = sc.nextInt();
		    }
		    maxPerimeter(arr, n);
		}
	}
}