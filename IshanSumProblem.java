/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(b == 1){
		        System.out.println("1");
		    } else {
		        int sum = b*(b+1)/2;
		        if(a>=sum)
		        System.out.println("1");
		        else
		        System.out.println("0");
		    }
		}
	}
}