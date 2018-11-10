import java.io.*;
import java.util.*;

public class FloydTriangle{
	static void print(int n)
	{
		int i,j,val=1;
		for(i=1;i<=n;i++)
		{
			for(j = 1;j<=i;j++){
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		print(n);
	}
}