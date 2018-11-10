/*GCD of Mth and Nth fibonacci number */
#include<iostream>
using namespace std;

const f[MAX] = 1000;

int fib(int n)
{
	//base case
	if(n == 0)
		return 0;
	if(n == 1 || n==2)
		return (f[n]=1);
	//if already computed
	if(f[n])
		return f[n];

	int k = (n & 1)? (n+1/2) : n/2;
	f[n] = (n & 1)? (fib(k)*fib(k)+fib(k-1)*fib(k-1)): (2*fib(k-1)+fib(k))*fib(k);
	return f[n];
}

int gcd(int m,int n)
{
	if(m==0)
		return n;
	return gcd(n%m,m);
}

int findGCDofFib(int m,int n)
{
	return fib(gcd(m,n));

}

int main()
{
	int m=3,n=12;
	cout<<findGCDofFib(n,m);
	return 0;
}
