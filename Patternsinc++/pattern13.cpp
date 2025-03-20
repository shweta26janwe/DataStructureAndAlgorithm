#include<bits/stdc++.h>
using namespace std;

void pattern13(int n)
{
 int num=1;
 for (int i = 0; i < n; i++)
 {
    /* code */
    for (int j = 0; j <=i; j++)
    {
        /* code */
        cout<<num <<" ";
        num += 1;
    }
    cout<<endl;
 }
 
}

int main()
{
    int n;
    cout<<"enter the no.";
    cin>>n;
   pattern13(n);
}