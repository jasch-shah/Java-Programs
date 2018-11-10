//Given a array of n strings, find the longest common prefix among 
//all strings present in the array.

##include <iostream>
using namespace std;

int findMinLength(string arr[], int n)
{
    int min = arr[0].length();
    for(int i=1;i<n;i++)
        if(arr[i].length() < min)
            min = arr[i].length();
    return min;    
}

string commonPrefix(string arr[],int n)
{
    int minlen = findMinLength(arr,n);
    string result;
    char current;
    for(int i=0;i<minlen;i++)
    {
        current = arr[0][i];
        for(int j=1;j<n;j++)
            if(arr[j][i] != current)
                return result;
            
        result.push_back(current);        
    }
    return result;
}

int main() {
	//code
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    int n;
	    cin>>n;
	    string arr[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>arr[i];
	    }
	    string ans = commonPrefix(arr,n);
	    if(ans.length())
	        cout<<ans<<endl;
	    else
	        cout<<"-1\n";
	}
	return 0;
}