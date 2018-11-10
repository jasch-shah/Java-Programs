import java.util.*;
import java.io.*;
import java.lang.*;

class InvertingFactor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int remainder = 0;
			int reverse[] = new int[n];
			int s[] = new int[n];
			for(int i = 0;i<n;i++){
				s[i] = sc.nextInt();
			}
			for(int i=0;i<n;i++){
				while(s[i]!=0){
					remainder = s[i]%10;
					reverse[i] = reverse[i]*10 + remainder;
					s[i] /= 10;
				}
			}
			Arrays.sort(reverse);
			int minDiff = reverse[1] - reverse[0];
			for(int i=2;i != reverse.length;i++)
				minDiff = Math.min(minDiff, reverse[i] - reverse[i-1]);

			System.out.println(minDiff);	 
		}

	}
}