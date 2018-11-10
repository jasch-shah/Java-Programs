#include <iostream>
using namespace std;

int main()
{
	int testcases;
	cout<<"Enter testcases";
	cin>>testcases;
	while(testcases-- > 0)
	{
		int n;
		cin>>n;
		int arr[n];
		int max=1;
		for(int i=0;i<n;i++)
		{
			cin>>arr[i];
			if(arr[i] > max)
				max=arr[i];
		}
		int decreasing = 0;
		int increasing = 0;
		int type=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i+1] > arr[i])
				increasing++;
			else
				decreasing++;
		}	
			if(decreasing == 0)
				type=1;
			else if(increasing == 0)
				type = 2;
			else if(increasing > decreasing && decreasing == 1)
				type = 4;
			else if(decreasing > increasing &&increasing == 1)
				type = 3;

			cout<<max<<" "<<type<<endl;

		}
	}
