import java.io.*;
import java.util.*;

public class PrintTriangle{
	public static void printTriangle(int n)
	{
		//no of spaces
		int k = 2*n - 2;
		//outer for  loop for no of rows hadling
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<k;j++)
			{
				System.out.print(" ");
			}
			k = k-1;
			for(int j = 0;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printTriangle(n);
	}
}