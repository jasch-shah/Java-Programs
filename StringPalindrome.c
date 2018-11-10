#include <stdio.h>
#include <string.h>

void isPalindrome(char str[])
{
	int l=0;
	int h = strlen(str)-1;
	while(h>l)
	{
		if(str[l++] != str[h--])
		{
			printf("%s is not palindrome\n",str );
			return;
		}
	}
	printf("%s is palindrome\n",str );
}

int main(int argc, char const *argv[])
{
	int strsize = 0;
	for(int i=1;i<argc;i++)
	{
		strsize += strlen(argv[i]);
		if(argc > i+1)
			strsize++;

	}
	char *string;
	string = malloc(strsize);
	string[0] = '\0';
	for(int i=1;i<argc;i++)
	{
		strcat(string,argv[i]);
		if(argc > i+1)
			strcat(string,"");
	} 
	isPalindrome(string);
	return 0;
}