import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
 /* Enter your code here. Read input from STDIN. Print output to STDOUT. */
      Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
      for(int i = 0 ; i < t.length ; i++)
      {
      String a = sc.next();
      String b = sc.next();
      findAndSort(a,b);
      
      }
      }
  void findAndSort(String s1, String s2){
       int present[] = new int[26];
       for(int i = 0; i<26;i++)
            present[i] = 0;
       int l1 = s1.length();
       int l2 = s2.length();
       
       for(int i = 0;i<l1;i++)
            present[s1[i]-'a'] = 1;
       
       for(int i = 0;i<l2;i++)
       {
            if(present[s2[i]-'a']==1 || present[s2[i]-'a'] == -1)
                 present[s2[i]-'a'] = -1;
            else present[s2[i]-'a'] = 2;
            
            
       }
       
       for(int i = 0;i<26;i++)
            if(present[i] == 1 || present[i]==2)
                 System.out.print(s1[present[i]]+" ");
  }
}