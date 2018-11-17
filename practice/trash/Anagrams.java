import java.util.*;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean anagram = true;
        Character[] charSet = {'A','B','C','D','E',
                               'F','G','H','I','J',
                               'K','L','M','N','O',
                               'P','Q','R','S','T',
                               'U','V','W','X','Y','Z'};
        
        HashMap<Character,Integer> AFrequency = new HashMap<Character,Integer>();
        HashMap<Character,Integer> BFrequency = new HashMap<Character,Integer>();
        
        initializeHash(AFrequency,charSet);
        initializeHash(BFrequency,charSet);
        
        a = a.toUpperCase();
        b = b.toUpperCase();
        
        for(int i = 0;i<a.length();i++)
        {
            Character letter = a.charAt(i);
            Integer frequency = AFrequency.get(letter);
            AFrequency.put(letter,++frequency);
        }
        for(int i = 0;i<b.length();i++)
        {
            Character letter = b.charAt(i);
            Integer frequency = BFrequency.get(letter);
            BFrequency.put(letter,++frequency);
        }
        
        //compare hash values
        for(Character letter : charSet)
        {
            if(!AFrequency.get(letter).equals(BFrequency.get(letter)))
            {
                anagram = false;
            }
        }
        
        return anagram;    
    }
    static void initializeHash(HashMap<Character, Integer> hash, Character[] set)
    {
        for(Character letter : set){
        
            hash.put(letter,0);
        }
    }

    static Character[] toCharacterArray(char[] array)
    {
        Character[] carray = new Character[array.length];
        for(int i = 0;i<array.length;i++)
        {
            carray[i] = (Character) array[i];
        }
        return carray;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = "anagramm";
        String b = "marganaa";
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}