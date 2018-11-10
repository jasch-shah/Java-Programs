#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	if(argc == 1)
	{
		printf("No Arguments\n");
		return 0;
	}else{
		int radius;
		float pi = 3.14;
		float area;
		radius = atoi(argv[1]);
		area = pi*radius*radius;
		printf("%.2f\n", area);
		return 0;

	}
	
}