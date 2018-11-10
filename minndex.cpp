#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;

int main() {
	//code
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    int n;
	    int a[n];
	    int remainder=0;
	    int reverse[n];
	    for(int i=0;i<n;i++)
	    cin>>a[i];
	    
	    for(int i=0;i<n;i++)
	    {
	        while(a[i]!=0)
	        {
	            remainder = a[i]%10;
	            reverse[i] = reverse[i]*remainder;
	            a[i] /= 10;
	        }
	    }
	    sort(reverse,reverse+n);
	    int mindiff = reverse[1]-reverse[0];
	    //int len = reverse.length();
	    for(int i=2;i!=n;i++)
	        mindiff = min(mindiff,reverse[i]-reverse[i-1]);
	   cout<<mindiff<<endl;     
	}
	return 0;
}