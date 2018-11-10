import java.util.*;
import java.io.*;
import java.lang.*;

class SubarraySum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int s = sc.nextInt();
			int arr[] = new int[n];

			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			boolean b = false;
			for(int i=0;i<n-1;i++){
				int tot = arr[i];
				for(int j=i+1;j<n;j++){
					tot += arr[j];
					if(tot == s){
						System.out.println((i+1)+" "+(j+1));
						b = true;
						break;
					}
				}
				if(b==true){
					break;
				}
			}
			if(b == false)
			{
				System.out.println("-1");
			}
		}
	}
}