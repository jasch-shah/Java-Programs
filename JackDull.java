/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class JackDull {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0)
		{
		    int n = sc.nextInt();
		    long k = sc.nextLong();
		    long m = 1;
		    for(int i=1;i<n;i++)
		    {
		        m = m*k;
		        m = m%1000000007;
		    }
		    System.out.println(m);
		    
		}
	}
}