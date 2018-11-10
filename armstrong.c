#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	int giv_num = atoi(argv[1]);
	int num;
	for(num=1;num<=giv_num;num++)
	{
		int a = num;
		int s=0,r=0;

		while(a>0)
		{
			s = a%10;
			r += (s*s*s);
			a=a/10;
		}
		if(r == num)
			printf("%d is armstrong no\n", num);
	}
	return 0;
}