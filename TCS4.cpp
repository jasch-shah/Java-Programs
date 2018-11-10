#include <iostream>
using namespace std;

void check_sum(int arr[],int size,int sum)
{
	for(int i=0;i<size-1;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(sum == (arr[i]+arr[j]))
			{
				cout<<"Perfect couple "<<arr[i]<<" and"<<arr[j];
				exit(0);
			}
		}
	}
	cout<<"No Perfect Couple";
}

int main()
{
	int size;
	cin>>size;
	int arr[size];
	for(int i=0;i<size;i++)
		cin>>arr[i];

	int sum;
	cin>>sum;
	check_sum(arr,size,sum);
	return 0;
}