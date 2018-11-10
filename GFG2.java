import java.util.*;
//import java.lang.*;
import java.io.*;

class GFG2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		int testcases = s.nextInt();
		while(count < testcases){
			sort(s.nextInt(), s.nextInt(), s);
			count++;
			

		}
	}

	public static void sort(int n, int k, Scanner s){
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		while(count < n)
		{
			int value = s.nextInt();
			if(value >= k){
				list.add(value);
			}
			count++;
		}
		Collections.sort(list);
		System.out.println(list);
	}
}