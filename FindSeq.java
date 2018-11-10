import java.io.*;
import java.lang.*;
import java.util.*;

class FindSeq{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			
			int n = sc.nextInt();
			if(n==0)
				System.out.println();
			else if(n==1)
				System.out.println(1);
			else if(n==2)
				System.out.println(1+" "+2);
			else if(n == 3)
				System.out.println(1+" "+2+" "+5);
			else if(n == 4)
				System.out.println(1+" "+2+" "+5+" "+8);
			else
			{
				long[] arr = new long[n+1];
				arr[0] = 1;
				arr[1] = 2;
				arr[2] = 5;
				arr[3] = 8;
				int k = 0;
				for(int i=4;i<n;i++){
					arr[i] = arr[i-1]*2-arr[k];
					k++;
				}
				for(int i = 0;i<n;i++)
					System.out.print(arr[i]+" ");
				System.out.println();

			}
			

		}

	}
}