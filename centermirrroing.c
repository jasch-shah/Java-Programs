#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int num;

int getnthbit(int n) {
	int check_bit = 1 << n;
	if(check_bit == (check_bit & num))
		return 1;
	return 0;
}

//invert nth bit
void invert(int n) {
	int check_bit = 1 << n;
	num = num ^ check_bit;
}

//reverse bits with start position s and end position e
void rev(int s, int e) {

	while(s > e) {
		int t1 = getnthbit(s);
		int t2 = getnthbit(e);

		if(t1 != t2) {
			invert(e);
			invert(s);
		}
		s--;
		e++;
	}
}

int main() {
    int t;

    scanf("%d", &t);

    while(t--) {
    	scanf("%d", &num);

    	int size = log(num) / log(2) + 1;  //size of bits
    	
    	int s1, s2, e1, e2 = 0;    	

    	s2 = size/2 - 1;

    	if(size & 1)
    		e1 = s2 + 2;
    	else e1 = s2 + 1;

    	s1 = size - 1;

    	rev(s1, e1);       //reverse first half
    	rev(s2, e2);       //reverse second half

    	printf("%d\n", num);
    }
    return 0;
}