#include <stdio.h>

func(char *s1,char * s2)
{
char *t;
t=s1;
s1=s2;
s2=t;
}
void main()
{
char *s1="jack", *s2="jill";
func(&s1,&s2);
printf("%s %s",s1,s2);
}