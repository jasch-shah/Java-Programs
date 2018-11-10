#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	int n,first=0,second=1,next,c;
	n = atoi(argv[1]);
	printf("These are %d values in fibo series \n", n);
	for(c=0;c<n;c++)
	{
		if(c <= 1)
			next=c;
		else
		{
			next = first+second;
			first = second;
			second = next;
		}
		printf("%d\n", next);
		
	}
	return 0;
}