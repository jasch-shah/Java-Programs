#include <iostream>
using namespace std;

void pattern(int n)
{
for(int i=1;i<n;i++)
{
	for(int j=1;j<i+1;j++)
	{
		cout<<" * ";
	}
	cout<<endl;
}

//print the lower portion
for(int i=n;i>0;i--)
{
	for(int j=i;j>0;j--)
	{
		cout<<" * ";
	}
	cout<<endl;
}
}

int main()
{
	int n;
	cin>>n;

	pattern(n);
}