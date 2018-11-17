/**
 * Implement an algorithm to determine if a string has all unique characters. What
 * if you cannot use additional data structures? (Assume string is ASCII based.)
 */
import java.util.Scanner;

public class array1{
	//use boolean array
	static boolean hasUniqueChars(String str){
		if(str == null || str.isEmpty()) return false;
		if(str.length() > 256) return false;

		boolean[] charSet = new boolean[256];
		for(int i = 0;i<str.length();i++){
			char ch = str.charAt(i);
			if(charSet[ch]) return false;
			else {
					
				charSet[ch] = true;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean op = hasUniqueChars(s);
		if(op == true){
			System.out.println("Unique");
		} else{
			System.out.println("Not Unique");
		}
	}
}