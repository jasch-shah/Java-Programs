import java.util.*;

public class ReversePyramid{
	public static void printStar(int n)
	{
		//number of spaces
		int i, j, k = 2*n-2;
		// handles no of rows. n in this case
		for(i = 0;i<n;i++)
		{
			//inner one handles spaces
			for(j = 0;j<k;j++)
				System.out.print(" ");
			k = k-2;

			for(j = 0;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printStar(n);
	}
}