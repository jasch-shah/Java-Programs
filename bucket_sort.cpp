#include<iostream>
#include <algorithm>
#include <vector>
using namespace std;

void bucketSort(float arr[], int n)
{
	//create n empty buckets
	vector<float> b[n];
	//put array elements in different buckets
	for(int i=0;i<n;i++)
	{
		int bi = n*arr[i];	//bucket index
		b[bi].push_back(arr[i]);
		cout<<"Bucket index for "<<arr[i]<<"is "<<bi<<endl;
	}
	//sort individual buckets
	for(int i=0;i<n;i++)
		sort(b[i].begin(),b[i].end());
	//concatenate all buckets into arr[]
	int index=0;
	for(int i=0;i<n;i++)
		for(int j=0;j<b[i].size();j++)
			arr[index++]=b[i][j];
}

int main()
{
	int n;
	cin>>n;
	float arr[n];
	for(int i=0;i<n;i++)
		cin>>arr[i];

	bucketSort(arr,n);
	cout<<"Sorted Array is "<<endl;
	for(int i=0;i<n;i++)
		cout<<arr[i]<<" ";
	return 0;

}