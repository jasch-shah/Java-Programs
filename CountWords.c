#include <stdio.h>

int main()
{
	char str[100];
	int count;
	fgets(str,100,stdin);
	int i=0;
	count = 1;
	while(str[i] != '\0')
	{
		if(str[i] != ' ' && str[i+1] == ' ')
		{
			count++;
		}
		i++;
	}
	printf("%d\n", count);
	return 0;
}