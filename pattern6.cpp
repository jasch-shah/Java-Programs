#include <iostream>

using namespace std;


int main()
{
	int n;
	cin>>n;

	int num=1;
	int gap;

	gap=n-1;
	for(int j=1;j<=n;j++)
	{
		num=j;
		for(int i=1;i<=gap;i++)
		{
			cout<<" ";
		}
		gap--;

		for(int i=1;i<=j;i++)
		{
			cout<<num;
			num++;

		}
		num--;
		num--;
		for(int i=1;i<j;i++)
		{
			cout<<num;
			num--;
		}
		cout<<endl;
	}
	return 0;
}