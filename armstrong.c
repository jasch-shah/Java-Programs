#include <stdio.h>
/* #include <stdlib.h>

int main(int argc, char const *argv[])
{
	int number=atoi(argv[1]);
	int num;
	for(num=1;num<=number;num++)
	{
		int a = num;
		int s=0;
		int r=0;

		while(a>0)
		{
			s=a%10;
			r=r+(s*s*s);
			a=a/10;
		}
		if(r == number)
			printf("%d is armstrong number \n",number);
		else
			printf("Not a armstrong number\n");
	}
	return 0;
}
*/

void main(int argc, char const *argv[])
{
	
	int num,num1,arms=0,rem;
	if(argc != 2)
	{
		printf("Enter number\n");
		scanf("%d",&num);
	}
	else
	{
		num = atoi(argv[1]);
	}
	num1=num;

	while(num>0)
	{
		rem=num%10;
		arms = arms+rem*rem*rem;
		num = num/10;
	}
	if(num1 == arms)
	{
		printf("%d is armstrong number\n", num1);
	}
	else
	{
		printf("%d is not armstrong number\n",num1 );
	}
}