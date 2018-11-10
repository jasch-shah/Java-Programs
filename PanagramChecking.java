import java.io.*;
import java.util.*;

class PanagramChecking
{

	static String missingChar(String str)
	{
		boolean present[]=new boolean[26];
		for(int i=0;i<present.length;i++)
			present[i]=false;
		for(int i=0;i<str.length();i++)
		{
			if(str[i] >= 'a' && str[i] <= 'z')
				present[str[i]-'a']=true;
			else if(str[i] >= 'A' && str[i] <= 'Z')
				present[str[i]-'A']=true;
		}

		StringBuilder result="";
		for(int i=0;i<26;i++)
			if(present[i] == false)
				result.append((char)(i+'a')).toString();

		return result;	
	}
	public static void main(String[] args) {
		String str="The quick brown fox jumps over the dog";
		System.out.println(missingChar(str));

	}
}