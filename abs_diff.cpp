#include <iostream>
using namespace std;

bool abs_diff(int x)
{
    int i=0,a[4],j;
    while(x!=0)
    {
        a[i]=x%10;
        x=x/10;
        i++;
    }
    for(j=0;j<=i-2;j++)
        {
            if(abs(a[j]-a[j+1])!=1)
            return false;
            
        }
    return true;        
            
}

void printArray(int arr[],int n,int k)
{
    int i,count=0;
    for(i=0;i<n;i++)
    {
        if(arr[i]<k && abs_diff(arr[i])==true){
            cout<<arr[i]<<" ";
            count++;
        }
    }
    if(count == 0)
        cout<<-1;
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
	    printArray(arr,n,k);
	    cout<<endl;
	}
	
	return 0;
}