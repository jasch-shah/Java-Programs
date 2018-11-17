import java.io.*;
import java.lang.*;
import java.util.*;

class sticks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0;i < t ; i++ ) {
			int n = sc.nextInt();
			int[] arr = new int[n];

			for (int j = 0;j < n ;j++ ) {
				arr[j] = sc.nextInt();
				
			}
			area_squares(arr);
			
		}
		sc.close();
	}

	private static void area_squares(int[] arr){
		int[] length = new int[1001];
		int count_sq = -1;
		int area = 0;

		for (int i = 0;i<arr.length ;i++ ) {
			length[arr[i]]++;
			System.out.println("Intermediate "+length[arr[i]]);

			}
			System.out.println(length.length);
		for (int j = 0;j<length.length ;j++ ) {
			if(length[j] >= 4){
				count_sq = length[j]/4;
				area = (int)Math.pow(j,2);
				System.out.println(area);
			}
		}
		if(count_sq == -1){
			System.out.println(count_sq);
		}

		System.out.println(area + " "+ count_sq);




	}
}