#include<stdio.h>
#include<conio.h>
void main()
{
    int a[20], n, k, i, pos;
    printf("enter the size of an array\n");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("enter the element\n" );
        scanf("%d", &a[i]);
    }
    printf("enter key element\n");
    scanf("%d", &k);
    pos = bin_search(a, n, k);
    if(pos == -1)
    {
    printf("element is not present");
    }
    else
    {
    printf("element is found at index=%d",pos);
    }
    getch();
}
int bin_search(int a[], int n, int k)
{
    int low, high, mid;
    low = 0;
    high = n-1;
    while(low <= high)
    {
    mid = (low+high) / 2;
    if(k = a[mid])
    {
    return(mid);
    }
    else if(k > a[mid])
    {
    low = mid + 1;
    }
    else
    {
    high = mid - 1;
    }
    }
    return(-1);
}