#include<bits/stdc++.h>
using namespace std;

void pattern14(int n)
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n-i-1; j++)
        {
            /* code */
            cout<<" ";
        }
        
        /*alphabet */
        char ch ='A';
        int breakpoint= (2*i+1)/2;
        for (int j = 0; j <2*i+1; j++)
        {
            /* code */
            cout<<ch;
            if(j<breakpoint)
            // if(j<i)
            {
            ch +=1;
            }
            else{
            ch -=1;
           }
        
        }
        
        for (int j = 0; j < n-i-1; j++)
        {
            /* code */
            cout<<" ";
        }
        cout<<endl;
    }
    
}
int main()
{
    int n;
    cout<<"enter the no.";
    cin>>n;
   pattern14(n);
}

