#include<bits/stdc++.h>
using namespace std;

void pattern12(int n)
{   int space = 2*(n-1);
    for (int i = 1; i <= n ; i++)
    {
       for (int j = 1; j <= i ; j++)
       {
       cout<<j;
       }
       for (int j = 1; j <= space; j++)
    //    for (int j = 1; j <= 2*n-2*i ; j++)
       {
        cout<<" ";
       }
       for (int j = i; j >= 1; j--)
       {
        cout<<j;
       }
        cout<<endl;
        space -=2;
    }
    
}

int main()
{
    int n;
    cout<<"enter the no.";
    cin>>n;
   pattern12(n);
}