import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Compression
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
		int n = sc.nextInt();
		int k = sc.nextInt();
		 System.out.println(2*(1+(k-1)/(double)k*(n-1)));
	}
	}
}
 