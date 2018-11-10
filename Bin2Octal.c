#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	long int n,r,c,b=1,s=0;
	n = atoi(argv[1]);
	c=n;
	while(c!=0)
	{
		r=c%10;
		s=s+r*b;
		c=c/10;
		b=b*2;

	}
	printf("%lo\n",s );
	return 0;
}