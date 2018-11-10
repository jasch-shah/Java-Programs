#include <iostream>
using namespace std;

bool check(char a)
{
    return (a>='a'&&a<='z')||(a>='A'&&a<='Z')||(a>='0'&&a<='9');
}

int main() {
	//code
	int testcase;
	cin>>testcase;
	
	while(testcase-- > 0)
	{
	    string word;
	    bool flag;
	    getline(cin, word);
	    flag=false;
	    for(int i=0,z=word.length()-1;i<word.length()/2;i++,z--)
	    {
	        while(!check(word[i]))
	        {
	            i++;
	        }
	        while(!check(word[z]))
	        {
	            z--;
	        }
	        if(i>z)
	        break;
	        
	        if(toupper(word[i])!=toupper(word[z]))
	        {
	            flag=true;
	            break;
	        }
	        
	        
	    }
	    if(flag)
	        cout<<"NO"<<endl;
	    else
	        cout<<"YES"<<endl;
	        
	}
	return 0;
}