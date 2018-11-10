#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	if(argc == 1)
	{
		printf("No argument\n");
		return 0;
	}
	else
	{
		int n;
		n = atoi(argv[1]);
		int bin[64];
		int i=0,j;
		while(n>0)
		{
			bin[i] = n%2;
			n=n/2;
			i++;
		}
		while(i)
		{
			printf("%d\n",bin[--i]);
		}
	}
	return 0;
}