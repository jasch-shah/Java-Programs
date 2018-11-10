/*#include <stdio.h>
int main()
{
	int (*p)[5];
	printf("%d\n", p);
	return 0;
}
*/

#include <stdio.h>


typedef int (*funPtr)(int);

int inc(int a)
{
	printf("Inside inc()%dn",a);
	return (a+1);
}