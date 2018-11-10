#include<iostream>
#include<algorithm>
using namespace std;

void numofstep(int k[1000],int p,int n)
{
	int w=0;
	
	for(int j=0;j<n;j++)
	{
		if(p>k[j])
			p=p+k[j];
         
	
         else
         {
              while(p<=k[j])
              {
              p=p+p-1;
                   w=w+1;
              }
             
                   p=p+k[j];
              
         }
	}
	cout<<w<<"\n";
}

int main()
{
	int t,size,num;
	
	cin>>t;
	while(t--)
	{
		int s[1000]={};
		cin>>size>>num;
		for(int i=0;i<num;i++)
			cin>>s[i];
	sort(s,s+num);
	
	numofstep(s,size,num);
	
	}
	
	return 0;
}