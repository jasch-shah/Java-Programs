#include <iostream>

using namespace std;

void pattern(int n)
{
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=(2*n);j++)
		{
			if(i>(n-j+1))
				cout<<" ";
			else
				cout<<"*";

			if((i+n)>j)
				cout<<" ";
			else
				cout<<"*";
		}
		cout<<"\n";
	}

	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=(2*n);j++)
		{
			if(i<j)
				cout<<" ";
			else
				cout<<"*";


			if(i<=((2*n)-j))
				cout<<" ";
			else
				cout<<"*";
		}
		cout<<"\n";
	}
}

int main()
{
	int n;
	cin>>n;
	pattern(n);
	return 0;

}

/*
if((i+n)>j)
	cout<<" ";
else
	cout<<"*";
	*/
