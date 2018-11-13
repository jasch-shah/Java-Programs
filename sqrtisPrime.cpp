#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
using namespace std;

bool isPrime(int n)
{
	if(n<2)
		return false;
	int i;
	for(i=2;i*i <= n;i++)
	{
		if(n%i == 0)
			return false;
	}
	return true;
}

int main(int argc, char  *argv[])
{
	if(argc == 0)
	{
	printf("No arguments\n");	
	return 0;
	}

	else
	{
		int n;
		n = atoi(argv[1]);
		float sq = 0;
		if(isPrime(n))
		{
			sq=sqrt(n);
			printf("%.2f",sq);
		}else
		printf("%.2f",sq);
		return 0;
	}
}