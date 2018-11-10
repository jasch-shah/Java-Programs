#include <stdio.h>

int main()
{
	char ch;
	scanf("%c", &ch);
	if(ch >= 'A' && ch <= 'Z')
	{
		ch = 'a'+(ch-'A');
	}
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	{
		printf("Vowel\n");
	}else{
		printf("Not a Vowel\n");
	}
}