#include <stdio.h>
#include <math.h>

int main()
{
	int num,var;
	float fvar;

	printf("Enter number\n");
	scanf("%d",&num);


	fvar = sqrt((double)num);
	var=fvar;
	if(var == fvar)
		printf("%d is a perfect square \n",num );
	else
		printf("%d is not a perfect square\n",num );

	return 0;
}