#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	//code
	int t;
	cin>>t;
	while(t-- > 0)
	{
	    string s;
	    cin>>s;
	    
	    transform(s.begin(),s.end(),s.begin(),::tolower);
	    int f[26] = {0};
	    for(int i=0;i<s.length();i++)
	       { 
	           f[s[i]-'a']++;
	          // cout<<"f[s["<<i<<"]-'a']++ is "<<f[s[i]-'a'];
	           
	       }
	    f[s[0]-'a']=1;
	    
	    long long int mul=1;
	    long long int m = 1000000007;
	    
	    for(int i=0;i<26;i++)
	    {
	        if(f[i]!=0)
	        mul = (mul*f[i]);
	    }
	    
	  /*  for(int i=0;i<s.length();i++)
	    {
	        cout<<"Freq Array contents are-->"<<f[i]<<"\t";
	    }
	    */
	    cout<<mul%m<<endl;
	    
	}
	
	return 0;
}