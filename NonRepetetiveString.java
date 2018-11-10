/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class NonRepetetiveString {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0)
		{
		    String s=sc.next();
		    int n=s.length();
		    String s1 = "";
		    s1=s1+s.charAt(0);
		    int j=0;
		    for(int i=1;i<n;i++)
		    {
		        if(s1.charAt(j)!=s.charAt(i))
		        {
		            s1=s1+s.charAt(i);
		            j++;
		        }
		    }
		    int count=1;
		    HashSet<Character> set = new HashSet<Character>();
		    set.add(s1.charAt(0));
		    for(int i=1;i<s1.length();i++)
		    {
		        if(set.contains(s1.charAt(i)))
		        {
		            count=0;
		            break;
		        }
		        set.add(s1.charAt(i));
		    }
		    System.out.println(count);
		}
	}
}