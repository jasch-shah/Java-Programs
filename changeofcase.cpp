#include <iostream>
using namespace std;

int main()
{
	char c;
	cin>>c;
	//upper to lower
	if('A' <= c && c <= 'Z')
	{
		c='a'+(c-'A');
		cout<<c<<endl;

	}else
	{
	if('a' <= c && c <= 'z' )
	{
		c = 'A'+(c-'a');
		cout<<c<<endl;
	}
}	
	return 0;
}