import java.io.*;
import java.util.*;

public class NumberPattern {
	public static void printNum(int n){
		int i, j, num;
		for(i = 0;i<n;i++)
		{
			//initialize number
			num = 1;
			//inner loop handle no of columns and values changing acc. to outer loop
			for(j = 0;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNum(n);
	}
}