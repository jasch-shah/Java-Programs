#include <stdio.h>
#include <stdlib.h>

int main(){
	int i,words,n,j=0;
	char* str = malloc(sizeof(char));

	scanf("%d",&n);

	while(j<=n){
		if(j==0){
			fgets(str,500,stdin);

			j++;
			continue;
		}
		fgets(str,500,stdin);

		i=0;
		words=1;

		while(str[i] != '\0')
		{
			if(str[i] == ' ' || str[i]=='\n' || str[i]=='\t'){
				words++;
			}
			i++;
		}
		printf("%d\n",words-1);
		j++;
	}
	return 0;
}