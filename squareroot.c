#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	if(argc == 1)
		printf("No argument\n");
	else
	{
		int n;
		n = atoi(argv[1]);
		float i = 0.00;
		while(i*i <= n)
		{
			i = i+0.001;
		}
		i=i-0.001;
		printf("%.2f\n",i );
	}
	return 0;
}