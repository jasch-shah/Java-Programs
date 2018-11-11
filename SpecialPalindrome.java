import java.util.*;

public class SpecialPalindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sc.nextInt();
		String s = sc.next();
		System.out.println(solve(s));

		sc.close();
	}

	static long solve(String s)
	{
		List<Block> blocks = buildBlocks(s);

		long result = 0;
		for(int i=0;i<blocks.size();i++)
		{
			result += (long) blocks.get(i).length * (blocks.get(i).length + 1) / 2;
			
		}
	}
}