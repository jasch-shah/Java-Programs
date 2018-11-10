#include <algorithm>
#include <iostream>
using namespace std;

int main()
{
	int case;
	cin>>case;

	while(case--){
		int size;
		cin>>size;

		int a[size];
		int sum=0;

		int largestSum=0;

		for(int i=0;i<size;i++){
			cin>>a[i];
			sum += a[i];
			if(sum < 0){
				sum=0;
			}
			if(sum > largestSum){
				largestSum = sum;
			}
		}

		if(largestSum == 0){
			sort(a, a+size);
			largestSum = a[size-1];
		}
		cout<<largestSum<<endl;
	}
	return 0;
}