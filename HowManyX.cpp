#include <iostream>
using namespace std;

int count(int num, int x)
{
    int c = 0;
    while(num!=0)
    {
        if(x == num%10)
        {
            c++;
            
        }
        num /= 10;
        
    }
    return c;
}

int main() {
	//code
	int testcase;
	cin>>testcase;
	while(testcase-- > 0)
	{
	    int n,l,u,sum=0;
	    cin>>n>>l>>u;
	    for(int i=l+1;i<u;i++)
	    {
	        sum += count(i,n);
	    }
	    cout<<sum<<endl;
	}
	return 0;
}