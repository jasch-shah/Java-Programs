import java.lang.*;
import java.io.*;
import java.util.*;

class Caeser
{
	public static void main(String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int count=0,count1=1;
		if(a.length()!=b.length())
		{
			System.out.println("-1");
			return;
		}

		for(int i=0;i<a.length();i++)
		{
			char a1 = a.charAt(i);
			char b1 = b.charAt(i);
			count = Math.abs((int)a1-(int)b1);
			//System.out.println(count);

			if(i==0)
				count1 = count;

			if(count1!=count && count1!=(Math.abs(count-26)))
			{
				System.out.println("-1");
				return;
			}
		}
		System.out.println(count1);
	}
}