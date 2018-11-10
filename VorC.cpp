#include <iostream>
using namespace std;


int main()
{
	char ch;
	cin>>ch;
	if(ch >= 'A' && ch<='Z')
	{
		ch = 'a'+(ch-'A');
		
	}
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	{
		cout<<"Vowel";
	}
	else
		cout<<"Not Vowel";
	return 0;
	
}