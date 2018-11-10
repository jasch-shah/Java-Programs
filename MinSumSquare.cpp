/*

Minimum sum of squares of character counts in a 
given string after removing k characters
*/

#include <iostream>
#include <queue>
using namespace std;

const int MAX = 26;

int minStringValue(string str,int k)
{
	int len = str.length();

	//if k is greater than length of string
	if(k >= len)
		return 0;

	//else find freq
	int frequency[MAX]={0};
	for(int i=0;i<len;i++)
		frequency[str[i]-'a']++;

	//push each char freq in priority queue
	priority_queue<int> q;
	for(int i=0;i<MAX;i++)
		q.push(frequency[i]);

	//remove k characters
	while(k--)
	{
		int temp=q.top();
		q.pop();
		temp=temp-1;
		q.push(temp);
	}

	//find sum
	int result=0;
	while(!q.empty())
	{
		int temp=q.top();
		result += temp*temp;
		q.pop();
	}

	return result;
}



int main()
{
	string str="abbccc";
	int k=2;
	cout<<minStringValue(str,k);

	str="aaab";
	k=2;
	cout<<minStringValue(str,k)<<endl;

	return 0;
}