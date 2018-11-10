#include <iostream>
#include <vector>
#include <math.h>
using namespace std;

int main() {
	//code
	
	int t;
	cin>>t;
	
	while(t-- > 0)
	{
	    int n;
	    cin>>n;
	    
	    vector<int> a;
	    while(n>0)
	    {
	        a.push_back(n%2);
	        n = n/2;
	    }
	    long long int sum = 0;
	    int x = a.size()-1;
	    while(x>=0)
	    {
	        sum += a[x]*pow(2,31-x);
	        x--;
	    }
	    cout<<sum<<endl;
	    
	}
	
	
	
	return 0;
}