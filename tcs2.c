#include <stdio.h>

#include <stdbool.h>

int fib(int n)

{

   if (n <= 1)

      return n;

   return fib(n-1) + fib(n-2);

}

bool isPrime(int n) {

    for(int i = 2; i < n; ++i) {

        if (n % i == 0) {

            // We are naive, but not stupid, if

            // the number has a divisor other

            // than 1 or itself, we return immediately.

            return false;

        }

    }

    return true;

}

int nthPrime(int n) {

    int candidate=2;

    int count;

    for(count = 0; count < n; ++candidate) {

        if (isPrime(candidate)) {

            ++count;

        }

    }

    // The candidate has been incremented once after the count reached n

    return candidate-1;

}

int main(void) {

    // your code goes here

    int n;

    scanf("%d",&n);

    if(n%2==0)

    {

        printf("%d",nthPrime(n/2));

    }

    else

    {

        printf("%d",fib((n/2) +1));

    }

    return 0;

}

