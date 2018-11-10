#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	//code
	
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    int n;
	    cin>>n;
	    int a[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>a[i];
	    }
	    //take two vectors to store even and odd in seperate vectors
	    vector<int> v1;
	    vector<int> v2;
	    
	    for(int i=0;i<n;i++)
	    {
	        //ODD:EVEN
	        (a[i] & 1) ? v2.push_back(a[i]) : v1.push_back(a[i]);
	    }
	    
	    sort(v2.begin(),v2.end(),greater<int>());   //decending order
	    sort(v1.begin(),v1.end());      //ascending order
	    
	    vector<int> :: iterator it;
	    
	    for(it = v2.begin();it != v2.end();it++)
	    {
	        cout << *it << " "; 
	    }
	    for(it = v1.begin();it != v1.end();it++)
	    {
	        cout << *it << " "; 
	    }
	    
	    cout<<"\n";
	    
	    
	}
	return 0;
}