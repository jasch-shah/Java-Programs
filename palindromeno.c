#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[])
{
	
	int num,rev_num=0,remainder,temp;
	num = atoi(argv[1]);
	temp=num;
	while(temp!=0)
	{
		remainder = temp%10;
		rev_num = rev_num*10+remainder;
		temp /= 10;
	}
	if(rev_num == num)
	{
		printf("%d is a palindrome number\n", num);
	}else
		printf("%d is not palindrome number\n",num);
	return 0;
}