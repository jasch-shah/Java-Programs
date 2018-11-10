/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class LuckyLottery {
    
    public static long calsum(long num)
    {
        int sum=0;
        while(num > 0)
        {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    long[] a = new long[n];
		    for(int i=0;i<n;i++)
		    a[i] = sc.nextLong();
		    
		    ArrayList<Long> al = new ArrayList<>();
		    long count=0;
		    long sum=0;
		    for(int i=0;i<n;i++)
		    {
		        sum = calsum(a[i]);
		        if(!al.contains(sum)){
		            count++;
		            al.add(sum);
		        }
		    }
		    System.out.println(count);
		}
	}
}