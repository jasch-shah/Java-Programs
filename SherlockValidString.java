import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockValidString {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        Map<Character, Integer> frequencies = new HashMap<>();
        
        for(char letter : s.toCharArray())
        {
            if(frequencies.containsKey(letter))
                frequencies.put(letter, frequencies.get(letter)+1);
            else
                frequencies.put(letter,1);
        }
        
        Set<Integer> st = new HashSet<>();
        for(int freq : frequencies.values())
        {
            st.add(freq);
        }
        
        if(st.size() > 2)
            System.out.println("NO");
        else if(st.size() == 1)
            System.out.println("YES");
        else
        {
            int f1=0;
            int f2=0;
            int f1count=0;
            int f2count=0;
            int i=0;
            for(int n : st)
            {
                if(i == 0) f1 = n;
                else f2 = n;
                i++;
            }
            
            for(int freq : frequencies.values())
            {
                if(freq == f1) f1count++;
                if(freq == f2) f2count++;
            }
            
            
            if((f1 == 1 && f1count == 1) || (f2 == 1 && f2count == 1))
                System.out.println("YES");
            else if((Math.abs(f1-f2) == 1) && (f1count == 1 || f2count == 1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

