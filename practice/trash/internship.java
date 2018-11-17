import java.util.*;
import java.io.*;
import java.lang.*;

class internship{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t --> 0){
			int n = sc.nextInt();
			int k = sc.nextInt();

			int p = 1;
			while(true){
				if(n >= (int)Math.pow(k,p))
					p++;
				else
					break;
			}
			System.out.println((int)Math.pow(k,p-1));
		}
	}
}