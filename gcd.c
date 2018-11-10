#include <stdio.h>

int main(int argc, char const *argv[])
{
	int num1,num2,min,i,gcd=1;
	if(argc != 3)
	{
		printf("Enter two arguments\n");
		exit(1);
	}
	num1 = atoi(argv[1]);
	num2 = atoi(argv[2]);
	min = (num1<num2)?num1:num2;
	for(int i=1;i<=min;i++)
	{
		if((num1%i)==0 && (num2%i) == 0)
			gcd = i;
	}
	printf("GCD of two numbers %d \n",gcd);
	return 0;
}