#include <iostream>
#include<bitset>

using namespace std;

void pattern(int min_star, int p_height){
	int p_spaces;
	p_spaces = p_height - 1;
	int i,j,k,n,x;

	x = 1;		//middle * for space V 
	//for loop for height of pyramid
	for(i = 0;i< p_height;i++)
	{
		//for loop for printing spaces
		for(j = p_spaces;j>i;j--){
			cout<<" ";
		}

		//print left pyramid
		for(k=0;k<min_star;k++)
			cout<<"*";
		
		//spaces in middle of 2 pyramids
		for(n = (p_height + p_height-2);n >= x;n--)
			cout<<" ";
		
		//pyramid for right side
		for(k=0;k<min_star;k++)
			cout<<"*";


		min_star = min_star+2;
		x = x+2;
		cout<<"\n";
	}
	
}

int main(){
	int min_star = 3;
	int p_height = 9;

	pattern(min_star,p_height);
	return 0;
}


