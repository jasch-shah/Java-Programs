/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0)
		{
		  int n = sc.nextInt();
		  Stack<Integer> stack = new Stack<Integer>();
		  
		  for(int i=0;i<n;i++){
		      int b = sc.nextInt();
		      stack.push(b);
		      
		  }
		  int c = 0;
		  while(!stack.empty()){
		      int d = stack.pop();
		      c++;
		      if(c!=n/2+1)
		        System.out.print(d+" ");
		  }
		  System.out.println();
		  t--;
		}
	}
}