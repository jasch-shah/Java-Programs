#include <iostream>
using namespace std;

int missingK(int arr[], int k, int n)
{
    int difference = 0,ans=0,count=k;
    bool flag=0;
    for(int i=0;i<n-1;i++)
    {
        difference = 0;
        //check if ith and i+1th no are consequtive or not
        if(arr[i]+1 != arr[i+1])
        {
            difference += (arr[i+1]-arr[i])-1;
        
            if(difference >= count)
            {
                ans = arr[i]+count;
                flag=1;
                break;
            }
            else
                count -= difference;
        }
    }
    if(flag)
        return ans;
    else
        return -1;
}

int main() {
	//code
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    int n,k;
	    cin>>n>>k;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    cin>>arr[i];
	    
	    int missing = missingK(arr,k,n);
	    cout<<missing<<endl;
	}
	return 0;
}