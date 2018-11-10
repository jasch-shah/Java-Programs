#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	if(argc < 3)
	{
		printf("Please provide breadth and height\n");
		return 0;
	}
	else
	{
		int base = atoi(argv[1]);
		int height = atoi(argv[2]);
		float area = 0.5*base*height;
		printf("%.2f\n", area);
	}
	return 0;
}