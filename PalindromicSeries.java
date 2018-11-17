/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class PalindromicSeries {
    
    public static String alpha2(int a)
    {
        String d = "";
        if(a == 0)
            d+="a";
        else if(a == 1)
            d+="b";
        else if(a == 2)
            d+="c";
        else if(a == 3)
            d+="d";
        else if(a == 4)
            d+="e";
        else if(a == 5)
            d+="f";
        else if(a == 6)
            d+="g";
        else if(a == 7)
            d+="h";
        else if(a == 8)
            d+="i";
        else
            d+="j";
        
        return d;    
    }
    
    public static String check(String str,int len,int sum)
    {
        String str2="";
        int i=0;
        for(;sum!=0;)
        {
            if(i == len)
                i=0;
                
                char a = str.charAt(i);
                str2 += a;
                sum--;
                i++;
        }
        
        StringBuffer sb = new StringBuffer(str2);
        sb.reverse();
        String rev = sb.toString();
        if(rev.equals(str2))
            return "YES";
        else
            return "NO";
    }
	public static void main (String[] args)throws Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
		    int num=Integer.parseInt(br.readLine());
		    int sum=0,rem,len=0;
		    String str="";
		    for(int g=num;g!=0;)
		    {
		        rem = g%10;
		        String alpha="";
		        alpha = alpha2(rem);
		        str += alpha;
		        sum += rem;
		        g /= 10;
		        len++;
		    }
		    StringBuffer sb = new StringBuffer(str);
		    sb.reverse();
		    str = sb.toString();
		    String s = check(str,len,sum);
		    System.out.println(s);
		}
		
	}
}