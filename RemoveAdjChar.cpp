#include <iostream>
using namespace std;

string removeDuplicateLetter(string s,int length)
{
    int len = s.length();
    int k=0,i;
    for(i=1;i<len;i++)
    {
        if(s[i-1] != s[i])
        s[k++] = s[i-1];
        
        else
        while(s[i-1] == s[i])
        i++;
    }
    s[k++] = s[i-1];
    s[k] = '\0';
    
    if(k!=length)
        removeDuplicateLetter(s,k);
    else 
        return s;
}


int main() {
	//code
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    string s;
	    cin>>s;
	    cout<<removeDuplicateLetter(s,s.length());
	    
	}
	
	return 0;
}