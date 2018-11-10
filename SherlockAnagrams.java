import java.io.*;
import java.util.*;

public class SherlockAnagrams
{
	public int check_anagrams(String s1, String s2)
	{
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();

		int first[] = new int[26];
		int second[] = new int[26];

		Arrays.fill(first, 0);
		Arrays.fill(second, 0);
		int c=0;
		while(c<a.length)
		{
			first[a[c]-'a']++;
			c++;
		}
		c=0;
		while(c<b.length)
		{
			second[b[c]-'a']++;
			c++;
		}

		for(c = 0;c<26;c++)
		{
			if(first[c] != second[c])
				return 0;
		}

		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SherlockAnagrams obj = new SherlockAnagrams();
		int t = sc.nextInt();
		String s = sc.nextLine();

		while(t-- > 0)
		{
			int c=0;
			s = sc.nextLine();
			char[] sa;
			sa = s.toCharArray();
			for(int ind=1;ind<sa.length;ind++)
			{
				for(int i = 0;i<sa.length-ind+1;i++)
				{
					String s1 = s.substring(i,ind+i);
					for(int j = i+1;j<sa.length-ind+1;j++){
						String s2 = s.substring(j,ind+j);

						if(obj.check_anagrams(s1,s2)==1)
							c++;
					}
				}
			}
			System.out.println(c);
		}
	}
}