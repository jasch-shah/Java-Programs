#include <stdio.h>
#include <math.h>


int meth1(n)
{
	int x;
	for(int i=0;i<100;i++)
	{
		x = pow(3,i);
		if(i==n)
			printf("%d ", x);
	}
}
int meth2(n)
{
	int x;
	for(int i=0;i<100;i++)
	{
		x = pow(2,i);
		if(i==n)
			printf("%d ", x);
	}
}
int main(){
	int n;
	scanf("%d", &n);
	if(n%2 == 0)
		meth1(n/2);
	else
		meth2(n/2+1);

			
}
/*

int main()
{
	int n;
	printf("Enter n\n");
	scanf("%d",&n);
	for(int i=2;i<=n+1;i++)
	{
		if(i%2 == 0)
			printf("%d ",pow(2,(i+1)/2));
		else
			printf("%d ",pow(3,i/2));
	}
	return 0;
}
*/