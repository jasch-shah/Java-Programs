#include <iostream>
#include <algorithm>
#include <bits/stdc++.h>
using namespace std;

void print(int arr[],int n,int k)
{
    int arr1[n];
    for(int i=0;i<n;i++)
        arr1[i] = arr[i];
    
    sort(arr1,arr1+n);
    
    int count=0;
    
    unordered_map<int ,int>m;
    int i=0;
    
    while(count<k){
        m[arr1[i]]++;
        i++;
        count++;
        
    }
    count=0;
    for(int i=0;i<n;i++)
    {
        if(count==k)
            break;
        if(m.find(arr[i])!=m.end() && m[arr[i]]){
            m[arr[i]]--;
            cout<<arr[i]<<" ";
            count++;
        }    
    }
    
    
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
	        
	        print(arr,n,k);
	        cout<<endl;
	}
	return 0;
}