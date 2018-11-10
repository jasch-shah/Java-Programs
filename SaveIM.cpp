#include <iostream>
using namespace std;

bool check(char a)
{
	return (a>='a'&&a<='z')||(a>='A'&&a<='Z')||(a>='0'&&a<='9');
}

int main()
{
	int t;
	cin>>t;
	cin.ignore();

	while(t-- > 0)
	{
		string s;
		bool flag;
		getline(cin,s);
		flag=false;
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
		{
			while(!check(s[i]))
			{
				i++;
			}
			while(!check(s[j]))
			{
				j--;
			}
			if(i>j)
				break;

			if(toupper(s[i]) != toupper(s[j]))
			{
				//cout<<"i char -->"<<s[i]<<" and j th char "<<s[j]<<" .";
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