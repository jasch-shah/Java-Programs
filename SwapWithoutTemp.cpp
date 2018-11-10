#include <iostream>
using namespace std;

int main()
{
	int x,y;
	cin>>x>>y;
	cout<<"Numbers are x = "<<x<<" and y = "<<y<<endl;
	//swap
	x = x+y;
	y = x-y;
	x = x-y;
	cout<<"After swapping x = "<<x<<" and y = "<<y<<endl;
	return 0;
}