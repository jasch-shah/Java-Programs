#include <iostream>

using namespace std;

void floyd(int n)
{
	int val=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			cout<<val++<<" ";
		}
		cout<<"\n";
	}
}

int main()
{

	int n;
	cin>>n;
	floyd(n);
	return 0;
}