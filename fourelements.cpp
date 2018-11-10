#include <iostream>
#include <bits/stdc++>
using namespace std;

int main() {
	//code
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	        cin>>arr[i];
	    
	    int x;
	    cin>>x;
	    
	    sort(arr,arr+n);
	    int count=0;
	    for(int i=0;i<n-3;i++)
	    {
	        for(int j=i+1;j<n-2;j++)
	        {
	            int l = j+1;
	            int r = n-1;
	            while(l<r)
	            {
	                if(arr[i]+arr[j]+arr[l]+arr[r] == x)
	                {
	                    count = 1;
	                    break;
	                }
	                else if(arr[i]+arr[j]+arr[l]+arr[r] < x)
	                {
	                    l++;
	                }else
	                    r--;
	            }
	            if(count == 1)
	                break;
	            
	        }
	        if(count == 1)
	            break;
	            
	    }
	    if(count == 1)
	    cout<<"1"<<endl;
	    else
	    cout<<"0"<<endl;
	}
	return 0;
}