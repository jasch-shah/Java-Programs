import java.io.*;
import java.util.*;
class pattern{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a = 1;
		System.out.println("Enter no of lines");
		int n = sc.nextInt();


		for(int i = n-1;i>=1;i--){
			for(int j = n-1;j>i;j--){
				System.out.print((a--)+"*");
			}
			System.out.println(a--);
		}		
	}
}