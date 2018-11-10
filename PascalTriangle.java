import java.util.*;
class PascalTriangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows, coef = 1;
		System.out.println("Enter no of rows");
		rows = sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int spaces = 1;spaces <= rows-i;spaces++)
			{
				System.out.print("  ");

			}
			for(int j=0;j<=i;j++){
				if(j == 0 || i == 0)
					coef = 1;
				else
					coef = coef*(i-j+1);

				System.out.print(coef+"  ");
			}
			System.out.println();
		}
	}

}