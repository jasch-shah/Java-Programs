#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	if(argc == 1)
	{
		printf("No Argument\n");
		return 0;
	}else{
		int n;
		n = atoi(argv[1]);
		int binN[64];
		int i=0;int j;
		while(n>0)
		{
			binN[i] = n%2;
			n=n/2;
			i++;
		}
		while(i)
		{
			printf("%d",binN[--i]);
		}
		return 0;
	}
	
}