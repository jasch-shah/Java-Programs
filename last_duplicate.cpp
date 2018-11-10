#include <iostream>
using namespace std;

int main()
{
	int t;

	cin>>t;
	while(t-- > 0)
	{
		int n,j,flag=0;
		cin>>n;
		int a[n];
		for(int i=0;i<n;i++)
			cin>>a[i];
		int l;
		l = n-1;
		for(j=l;j>0;j++)
		{
			if(a[j] == a[j-1])
			{
				flag=1;
				break;

			}
		}
		if(flag == 0)
		{
			cout<<"-1";
		}else
		{
			cout<<j<<" "<<a[j];
		}
	}
	return 0;
}