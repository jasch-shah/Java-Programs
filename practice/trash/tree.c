#include <stdio.h>

int main()
{
	int i,j;
	int space=14;
	for(i=1;i<=15;i++)
	{
		for(j=1;j<=space;j++)
			printf(" ");
	

	for(j=1;j<=i;j++)
	{
		if(i%2==0)
			printf("-");
		else
			printf("*");
		if(j!=i)
			printf(" ");
	}
	printf("\n");
	space--;
	}

	return 0;
}