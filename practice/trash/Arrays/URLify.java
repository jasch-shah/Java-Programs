/**
 * Write a method to replace all spaces in a string with'%20'. You may assume that
 * the string has sufficient space at the end of the string to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform this
 * operation in place.)
 * EXAMPLE
 * Input:  "Mr John Smith    "
 * Output: "Mr%20John%20Smith"
 */

import java.util.*;




public class URLify{

	static final char[] str = {'a','b',' ','c',' ','d','\0','\0','\0','\0','\0','\0','\0'};
	static final int length = 6;

	public static void main(String[] args) {
		
		char[] a = replaceSpaces(str);
		System.out.println(str);
		
	}

	static char[] replaceSpaces(char[] str){
		//scan 1 : count spaces
		int index = length - 1;
		int cnt = 0;
		for(char ch : str){
			if(ch == ' ') ++cnt;
		}

		//scan 2:replace spaces
		int p = length + 2*cnt;
		str[p] = '\0';
		--p;
		for(int i = length - 1; i>=0;--i){
			if(str[i] == ' '){
				str[p--] = '0';
				str[p--] = '2';
				str[p--] = '%';
			} else {
				str[p--] = str[i];
			}
		}
		return str;

	}

	
}