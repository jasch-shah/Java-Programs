#include <stdio.h>

int main(int argc, char const *argv[])
{
	/* code */
	int n;
	n = atoi(argv[1]);
	if(n%4 == 0)
	{
		if(n%100 == 0)
		{
			if(n%400 == 0)
				printf("Leap Year\n");
			else
				printf("Not Leap Year\n");
		}
		else
			printf("Leap Year\n");
	}else
		printf("Not Leap Year\n");
	return 0;
}