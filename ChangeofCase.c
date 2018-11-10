#include <stdio.h>
 int main()
 {
 	char c;
 	scanf("%c", &c);
 	//upper to lower case
 	if('A' <= c && c<='Z')
 	{
 		printf("%c\n",'a'+(c-'A'));
 	}
 	if('a' <= c && c<='z')
 	{
 		printf("%c\n",'A'+(c-'a'));
 	}
 	return 0;
 }