#include<iostream>
#include <vector>
using namespace std;

vector<int> digitParser(int num)
{
	vector<int> digits;
	int digit;
	while(num!=0)
	{
		digit=num%10;
		num /= 10;
		digits.push_back(digit);
	}
	return digits;
}

int Sum(vector<int> digits)
{
	int sum=0;
	for(int i=0;i<digits.size();i++)
	{
		sum+=digits[i];
	}
	return sum;

}


void outputResult(int num)
{
	vector<int> digits = digitParser(num);

	if(digits.size() == 1)
	{
		cout<<num<<endl;
	}
	else{
		while((num/10)>=1)
		{
			int sum = Sum(digits);
			num=sum;
			if((num/10)<1)
			{
				cout<<digits[0]*digits[1]<<endl;
			}
			digits = digitParser(num);
		}
	}
}



int main()
{

int t;
cin>>t;
while(t-- > 0)
{
	int num;
	cin>>num;

	outputResult(num);
}
return 0;
}
