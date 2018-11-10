#include <iostream>
using namespace std;

void printKMax(int arr[], int n, int k)
{
    int j,max;
    for(int i = 0;i<= n-k;i++)
    {
        max = arr[i];
        for(j = 1;j<k;j++)
        {
            if(arr[i+j] > max)
            {
                max = arr[i+j];
            }
        }
        cout<<max<<" ";
    }
    cout<<"\n";
}

int main() {
	//code
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    int n;
	    cin>>n;
	    int k;
	    cin>>k;
	    int arr[n];
	    for(int i = 0;i<n;i++)
	    {
	        cin>>arr[i];
	    }
	    
	    printKMax(arr, n, k);
	}
	return 0;
}