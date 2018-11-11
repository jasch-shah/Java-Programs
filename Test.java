import java.util.*;
public class Test
 {
  public static void main(String[] args) {
   char[] chars = new char[] {'\u0097'};
    String str = new String(chars); 
    byte[] bytes = str.getBytes(); 
    System.out.println(Arrays.toString(bytes));

 }

 }

