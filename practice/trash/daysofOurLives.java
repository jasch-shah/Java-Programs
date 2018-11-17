import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class daysofOurLives{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int days = 7;
		BigInteger[] arr = new BigInteger[days];
		BigInteger d = new BigInteger(Integer.toString(days));


		while(t > 0){
			BigInteger n = new BigInteger(sc.next());

			int s = sc.nextInt();
			BigInteger modulo = n.mod(d);
			int mod = modulo.intValue();
			BigInteger total = n.divide(d);

			for(int i = 0;i < 7;i++){
				arr[i] = total;
			}
			int p = 0;
			for(int i = s-2;i<mod-2+s;i++){
				p = ((i+1)%7);
				arr[p] = arr[p].add(BigInteger.ONE);
			}
			for(int i = 0;i<7;i++){
				System.out.println(arr[i]+" ");

			}
			System.out.println();
			t--;
		}
		sc.close();
	}
}