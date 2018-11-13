#include <iostream>
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	if(argc == 1)
	{
		printf("no arguments\n");
		return 0;
	}
	else
	{
		int n;
		n=atoi(argv[1]);
		float i=0.00;
		while(i*i <= n)
		{
			i+=0.001;
		}
		i-=0.001;
		printf("%.2f\n",i);
	}
	
}