import java.util.*;
import java.io.*;

class IntegerOrString
{
	static boolean isNumber(String s)
	{
		for(int i=0;i<s.length();i++)
			if(Character.isDigit(s.charAt(i))== false)
				return false;
			return true;
	}

	public static void main(String[] args) {
		String str="455g4";
		if(isNumber(str))
			System.out.println("Integer");
		else
			System.out.println("String");
	}
}