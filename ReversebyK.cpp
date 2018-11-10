#include <iostream>
using namespace std;

int main() {
	//code
	int t;
	cin>>t;
	while(t-- > 0){
	    int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>arr[i];
	    }
	    int k;
	    cin>>k;
	    
	    for(int i = 0;i<n;i += k)
	    {
	        int left = i;
	        int right = min(n-1, i+k-1);
	        while(left < right)
	        {
	        	cout<<"Swap between "<<arr[left++]<<" and "<<arr[right--];
	            swap(arr[left++],arr[right--]);
	        }
	    }
	    for(int i = 0;i<n;i++)
	    {
	        cout<<arr[i]<<" ";
	    }
	    cout<<"\n";
	    
	}
	return 0;
}