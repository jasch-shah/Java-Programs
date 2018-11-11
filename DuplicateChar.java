import java.util.*;

public class DuplicateChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String input = sc.next();

		printDuplicateString(input);
	}

	public static void printDuplicateString(String input)
	{
		char[] characters = input.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch : characters)
		{
			if(charMap.containsKey(ch))
				charMap.put(ch, charMap.get(ch) + 1);
			else
				charMap.put(ch, 1);
		}

		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in input string '%s' %n",input);
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue() > 1)
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());

		}
	}
}