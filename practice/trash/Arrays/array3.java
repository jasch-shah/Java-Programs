/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * (Assume comparison is case-sensitive, space-significant, ASCII-based.)
 */

import java.util.*;

public class array3{
	static boolean isPermutation(String s1, String s2){
		if(s1 == null && s2 == null) return false;
		if(s1 == null || s2 == null) return false;
		if(s1.length() != s2.length()) return false;

		char[] chaArray1 = s1.toCharArray();
		char[] chaArray2 = s2.toCharArray();
		Arrays.sort(chaArray1);
		Arrays.sort(chaArray2);
		return new String(chaArray1).equals(new String(chaArray2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings");
		String s1 = sc.next();
		String s2 = sc.next();

		boolean res = isPermutation(s1,s2);

		if(res == true){
			System.out.println(" String a : "+s1+" is a permutation of string b : "+s2);
		} else {
			System.out.println("Not a Permutation");
		}

	}

}