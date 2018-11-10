#include <stdio.h>

int main(int argc, char const *argv[])
{
	int sum = 0,i=1,count=0;
	if(argc == 1)
		printf("Enter nos\n");

	count = argc-1;
	while(i<=count)
	{
		sum += atoi(argv[i]);
		i++;
	}
	printf("Avg of nos is %d\n",sum/count );
	return 0;
}