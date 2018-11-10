#include <stdio.h>

int main()
{
	int n,flag=0;
	printf("Enter no\n");
	scanf("%d", &n);
	for(int i=2;i<=sqrt(n);i++)
	{
		if(n%i == 0)
		{
			flag=1;
			break;
		}
	}
	if(flag == 0)
		printf("%d is prime no\n", n);
	else
		printf("%d is not prime no\n", n);
	return 0;
}