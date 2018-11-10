import java.io.*;
import java.util.*;
import java.lang.*;

class MaximumIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i<n;i++)
				arr[i] = sc.nextInt();
			int max = 0;
			int[] leftmin = new int[n];
			leftmin[0] = arr[0];
			for(int i = 1;i<n;i++){
				if(arr[i] < leftmin[i-1]){
					leftmin[i] = arr[i];
				} else {
					leftmin[i] = leftmin[i-1];
				}
			}
			for(int i=1;i<n;i++){
				if(arr[i] >= leftmin[i-1]){
					for(int j=0;j<i;j++){
						if(arr[i]>=arr[j]){
							int diff = i - j;
							if(diff>max)
								max = diff;
							break;
						}
					}
				}
			}
			System.out.println(max);
			
		}
	}
}