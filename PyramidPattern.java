import java.util.*;
import java.io.*;

public class PyramidPattern{
	public static void pattern(int n)
	{
		// for printing upper part of pyramid
		for(int i = 1;i<n;i++)
		{
			for(int j = 1;j<i+1;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		//for printing lower part
		for(int i = n; i >0;i--)
		{
			for(int j = i;j>0;j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		pattern(n);
	}


}