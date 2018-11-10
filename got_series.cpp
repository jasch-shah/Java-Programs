#include <iostream>
using namespace std;

int setb(long long int n)
{
    int count=0;
    while(n>0)
    {
        n=(n&(n-1));
        count++;
        cout<<count;
    }
    return count;
}

int main() {
	//code
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    long long int n;
	    cin>>n;
	    cout<<n*setb(n)<<endl;
	}
	return 0;
}

