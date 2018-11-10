#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	//code
	int t;
	vector<int> a;
	cin>>t;
	while(t-- > 0)
	{
	    int n,m;        //n is no of arrays and m is no of elements in each array
	    cin>>n;
	    int temp;
	    for(int i=0;i<n;i++)
	    {
	        cin>>m;
	        for(int j=0;j<m;j++)
	        {
	            cin>>temp;
	            a.push_back(temp);
	        }
	    }
	    sort(a.begin(),a.end());
	    for(int i=0;i<a.size();i++)
	    {
	        if(a[i] == a[i+1] || a[i] == 0)
	        {
	            continue;
	        }else
	        {
	            cout<<a[i]<<" ";
	        }
	    }
	    cout<<endl;
	    //fill(a.begin(),a.end(),0);
	}
	
	return 0;
}