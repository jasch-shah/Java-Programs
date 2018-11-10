import java.io.*;
 
class GFG {
     
    // Returns sum of all digits in numbers 
    // from 1 to n
    static int sumOfDigitsFrom1ToN(int n)
    {
        int result = 0; // initialize result
      
        // One by one compute sum of digits
        // in every number from 1 to n
        for (int x = 1; x < n; x++)
            result += sumOfDigits(x);
      
        return result;
    }
      
    // A utility function to compute sum 
    // of digits in a given number x
    static int sumOfDigits(int x)
    {
        int sum = 0;
        while (x != 0)
        {
            sum += x % 10;
            x   = x / 10;
        }
        return sum;
    }
      
    // Driver Program
    public static void main(String args[])
    {
        int n = 10;
        System.out.println("Sum of digits in numbers"
                          +" from 1 to " + n + " is "
                          + sumOfDigitsFrom1ToN(n));
    }
}