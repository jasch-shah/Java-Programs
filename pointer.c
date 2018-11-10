/*#include<stdio.h>
void fun(int **p);

int main()
{
    int a[3][4] = {1, 2, 3, 4, 4, 3, 2, 8, 7, 8, 9, 0};
    int *ptr;
    ptr = &a[0][0];
    fun(&ptr);
    return 0;
}
void fun(int **p)
{
    printf("%d\n", **p);
}
*/

#include<stdio.h>

int main()
{
    static int arr[] = {0, 1, 2, 3, 4};
    int *p[] = {arr, arr+1, arr+2, arr+3, arr+4};
    int **ptr=p;
    printf("%d\n", **ptr);
    ptr++;
    printf("%d, %d, %d\n", ptr-p, *ptr-arr, **ptr);
    *ptr++;
    printf("%d, %d, %d\n", ptr-p, *ptr-arr, **ptr);
    *++ptr;
    printf("%d, %d, %d\n", ptr-p, *ptr-arr, **ptr);
    ++*ptr;
    printf("%d, %d, %d\n", ptr-p, *ptr-arr, **ptr);
    return 0;
}