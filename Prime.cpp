#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	int n,flag=0;
	cin>>n;
	for(int i=2;i<=sqrt(n);i++)
	{
		if(n%i == 0)
		{
			flag=1;
			break;
		}
	}
	if(flag == 0)
		cout<<"Prime";
	else
		cout<<"Not Prime";
	return 0;
}