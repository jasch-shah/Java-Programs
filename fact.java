import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class fact {
     
     static int findFactorial(int n){
          if(n == 1 || n == 0){
               return 1;
          }else{
               return n*findFactorial(n-1);
          }
          
     }

 public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
     // System.out.println("Enter no");
      int t = sc.nextInt();
      while(t-- >0)
      {
      int n = sc.nextInt();
      System.out.println(findFactorial(n));
      }
 }
}