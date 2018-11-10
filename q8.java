/**
 * Assume you have a method isSubstring which checks if one word is a
 * substring of another. Given two strings, si and s2, write code to check if s2 is
 * a rotation of si using only one call to isSubstring (e.g.,"waterbottle" is a rotation
 * of "erbottlewat").
 * (Assume an empty string is a rotation of an empty string.)
 */
import java.util.*;
public class q8{
	static boolean isRotation(String s1, String s2){
		if(s1 == null || s2 == null) return false;
		if(s1.length() != s2.length()) return false;
		return isSubstring(s1+s2, s2);
	}
	static private boolean isSubstring(String s1, String s2){
		return s1.contains(s2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		boolean res = isRotation(s1, s2);
		System.out.println(res);

	}
}