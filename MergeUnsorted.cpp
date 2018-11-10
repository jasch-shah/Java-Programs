#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
	//code
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    int n,m;
	    cin>>n>>m;
	    
	    vector<int> arr(n+m);
	    
	    for(int i=0;i<arr.size();i++)
	    cin>>arr[i];
	    
	    sort(arr.begin(),arr.end());
	    for(int i=0;i<arr.size();i++)
	    cout<<arr[i]<<" ";
	    cout<<endl;
	    
	    
	}
	return 0;
}