/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Sort012 {
	public static void main (String[] args)throws IOException {
		//code
		Sort012 g = new Sort012();
		g.solve();
	}
	
	void solve() throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-- > 0){
	        int[] count = new int[3];
	        int n = Integer.parseInt(br.readLine());
	        
	        String[] arr = br.readLine().split(" ");
	        
	        for(int i=0;i<n;i++){
	            count[Integer.parseInt(arr[i])]++;
	        }
	        
	        for(int i=0;i<3;i++){
	            for(int j=0;j<count[i];j++){
	                System.out.print(i+" ");
	            }
	        }
	        System.out.println();
	    }
	    
	}
}