/*
Consider the below series:
1,2,1,3,2,5,3,7,5,11,8,13,13,17,

This series is a mixture of 2 series fail the odd terms in this series form a Fibonacci series and all the even terms are the prime numbers in ascending order

Write a program to find the Nth term in this series

The value N in a positive integer that should be read from mm. The Nth term that is calculated by the program should be written to STDOUT Otherthan the value of Nth term , no other characters / string or message should be written to STDOUT.

For example, when N:14, the 14th term in the series is 17 So only the value 17 should be printed to STDOUT


*/

#include <stdio.h>
#include <stdlib.h>

int fib(int n)
{
	if(n<=1)
		return n;
	return fib(n-1)+fib(n-2);
}

bool isPrime(int n)
{
	for(int i=2;i<n;i++)
	{
		if(n%i == 0){
			return false;
		}
	}
	return true;
}
int prime(int n)
{
	int candidate=2;
	int count;
	for(count=0;count<n;candidate++){
		if(isPrime(candidate)){
			count++;
		}
	}
	return candidate
}

int main()
{
	int n,e;
	scanf("%d", &n);
	if(n%2 == 0){
		printf("%d", prime(n/2));
	}else{
		printf("%d ",fib((n/2)+1));
	}
	return 0;
}