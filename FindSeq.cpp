#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    long int n, a[50],k=0;
	    cin>>n;
	    a[0] = 1;
	    a[1] = 2;
	    a[2] = 5;
	    a[3] = 8;
	    for(long int i = 4;i<n;i++){
	        a[i] = a[i-1]*2-a[k];
	        k++;
	    }
	    for(int j = 0;j<n;j++)
	        cout<<a[j]<<" ";
	        cout<<endl;
	    
	}
	return 0;
}