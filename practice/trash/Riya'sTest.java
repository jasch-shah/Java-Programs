/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in) ;
		int t=s.nextInt() ;
		
		
		for(;t>0;t--)
		{
		    int[] arr=new int[26] ;
		    String str=s.next() ;
		    int temp=str.length()/2 ;
		    if(str.length()%2!=0)
		    temp++;
		    for(int i=0;i<str.length()/2;i++)
		    {
		       arr[(int)(str.charAt(i)-97)]++ ;
		    }
		    for(int i=temp;i<str.length();i++)
		    {
		        arr[(int)(str.charAt(i)-97)]-- ;
		    }
		    boolean bool=true ;
		    for(int i:arr)
		    {
		        if(i!=0)
		        {System.out.println("NO") ;
		        bool=false ;
		        break ;}
		    }
		    if(bool==true)
		    System.out.println("YES") ;
		    
		}
	}
}