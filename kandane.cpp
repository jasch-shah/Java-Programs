#include <iostream>
using namespace std;

int main()
{
	int cases;
	cin>>cases;
	while(cases-- > 0)
	{
		int n;
		cout<<"Enter array size";
		cin>>n;
		int a[n];
		int sum=0;
		int largestSum=0;
		cout<<"Enter array elements";
		for(int i=0;i<n;i++)
			{
				cin>>a[i];

				sum += a[i];
				if(sum < 0)
				{
					sum = 0;		//reset sum
				}

				if(sum > largestSum)
				{
					largestSum = sum;

				}

			}

			if(largestSum == 0)
			{
				sort(a,a+n);
				largestSum = a[n-1];
			}
			cout<<largestSum<<endl;

		


	}
	return 0;
}