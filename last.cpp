#include <iostream>
using namespace std;

int main()
{
	int t;
	cin>>t;
	while(t-- > 0)
	{
		int n;
		cin>>n;
		int a[n];
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		int flag=0;
		for(int i = n-1;i>=0;i--)
		{
			if(a[i] == a[i-1])
			{
				flag=1;
				cout<<i<<" "<<a[i]<<endl;
				break;
			}
		}
		if(flag == 0)
		{
			cout<<"-1"<<endl;
		}
	}
	return 0;
}