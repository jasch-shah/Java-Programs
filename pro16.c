#include <stdio.h>

void check_sum(int arr[],int size,int sum)
{
	for(int i=0;i<size-1;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(sum == (arr[i]+arr[j]))
			{
				printf("Perfect pair is %d %d \n",arr[i],arr[j]);
				exit(0);
			}
		}
		printf("No pair \n");
	}
}

int main()
{

	int size;
	scanf("%d",&size);
	int arr[50];
	for(int i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}	
		int sum;
		scanf("%d",&sum);
		check_sum(arr,size,sum);
		return 0;
	
}