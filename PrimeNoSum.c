#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int n,prime[1000],x,y,flag=0;
	scanf("%d",&n);
	prime[0] = 2;
	int k=1,i,j;
	for(i=3;i<n;i++){
		for(j=2;j<i;j++){
			if(i%j==0) break;
		}
		if(j==i){
			prime[k] = i;
			k++;
		}
	}

	for(x=0;x<k;x++){
		for(y=0;y<k;y++){
			if(n==prime[x]+prime[y]){
				flag = 1;
				break;
			} else {
				continue;
			}
		}
	}
	if(flag==1)
		printf("true");
	else
		printf("false");

return 0;
}