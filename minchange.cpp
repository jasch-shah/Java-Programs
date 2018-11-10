#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	//code
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    string str;
	    cin>>str;
	    
	    int n=str.length();
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n-i-1;j++)
	        {
	        	int temp;
	            if(str[j]>str[j+1])
	            {
	                temp = str[j];
	                str[j] = str[j+1];
	                str[j+1] = temp;
	            }
	            cout<<temp<<endl<<str[j]<<endl<<str[i+1];
	        }
	    }
	    int count=0,j=0,k=0;
	    char c = str[0];
	    while(str[j]!='\0')
	    {
	        while(str[k] == c)
	        {
	            k++;
	            j++;
	        }
	        c=str[k];
	        count++;
	    }
	    cout<<abs(n-count)<<endl;
	}
	return 0;
}