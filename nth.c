/*
Write a program to find the nth term in this series.
The value n in a positive integer that should be read from STDIN the nth term that is calculated by the program should be written to STDOUT. Other than the value of the nth term no other characters /strings or message should be written to STDOUT.
For example if n=10,the 10 th term in the series is to be derived from the 9th term in the series. The 9th term is 8 so the 10th term is (8/2)=4. Only the value 4 should be printed to STDOUT.
You can assume that the n will not exceed 20,000.

*/

#include <stdio.h>

int main()
{
	int n;
	scanf("%d", &n);
	if(n%2 == 1)
	{
		int a=1;
		int r=2;
		int term = (n+1)/2;
		int res = 2*(term-1);
		printf("%d\n", res);
	}else{
		int a=1;
		int r = 3;
		int term = n/2;
		int res = term-1;
		printf("%d\n", res);

	}
return 0;

}