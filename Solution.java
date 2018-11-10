import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     
     
     
     

 public static void main(String[] args) {
      
      int t,m,n,arr[];
     Scanner sc = new Scanner(System.in);
     t = sc.nextInt();
     arr = new int[t];
     for(int j=0 ; j<t ; j++){
          m = sc.nextInt();
          n = sc.nextInt();
          
          int result=0;
          for(int i = m;i<n;i++)
               result += i;
          arr[j] = result;
          
          for(int k = 0;k<t;k++)
               System.out.println(arr[k]);
          
          
 
           }
     }
}   
     