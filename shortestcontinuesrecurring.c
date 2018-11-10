#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


int main() {

    int t, p, q;
    scanf("%d", &t);
    while(t--) {

    	int *arr = calloc(14000, sizeof(int));
    	int pos = 0;

    	scanf("%d%d",&p, &q);

 		int r = p % q;

 		while(r != 0) {
 			r = (r * 10) % q;
 			if(arr[r] != 0) {
 				printf("%d\n", ++pos - arr[r]);
 				break;
 			}
 			else
 				arr[r] = ++pos;
 		}
 		if(r == 0) {
 			printf("-1\n");
 		}
 		free(arr);
    }
    return 0;
}