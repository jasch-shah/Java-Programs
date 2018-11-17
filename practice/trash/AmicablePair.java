import java.util.*;
import java.lang.*;
import java.io.*;

class AmicablePair{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();sc.nextLine();
		while(test --> 0){
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int snum1 = 0;
			int snum2 = 0;

			for(int i = 1;i<num1;i++){
				if(num1%i == 0)
					snum1 = snum1+i; 
			}
			for(int i = 1;i<num2;i++){
				if(num2%i==0)
					snum2 = snum2+i;
			}
			if(snum1==num2 && snum2==num1)
			{
				System.out.println(1);
			}
			else
				System.out.println(0);
		}
	}
}