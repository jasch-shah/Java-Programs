import java.io.*;
import java.util.*;

public class NumberPattern2{
	public static void printNum(int n){
		int i,j,num=1;

		for(i = 0;i<n;i++)
		{
			//without reassigning num
			for(j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num = num + 1;
			}
			System.out.println(); 
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printNum(n);
	}
}