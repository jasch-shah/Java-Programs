import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in) ;
		int t=s.nextInt() ;
		for(;t>0;t--)
		{
		    int n=s.nextInt();
		    int count=0,i=0 ;
		    for(i=3;;i=i*2)
		    {
		        if(count+i>n)
		        break ;
		        count=count+i ;
		    }
		    n=n-count ;
		    for(int j=1;j<n;i--,j++) ;
		    System.out.println(i) ;
		}
		
	}
}