import java.io.*;
import java.util.*;

class pyramid{

	public static void printStar(int n){
		int i,j;
		for(i = 0;i<n;i++)
		{
			for(j = 0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printStar(n);
	}
}
