#include <stdio.h>
#include <string.h>
 
int main()
{
   char string[1000];
 
   printf("Input a string to convert to upper case\n");
   gets(string);
   string = strlwr(string);
 
   printf("The string in upper case: %s\n", string);
 
   return  0;
}