#include<iostream>
using namespace std;
void print7(int n)
{
    for (int i = 0; i <=n; i++)
    {
        for (int j = 1; j <=n-i+1; j++)
        {
          cout<<" ";  
            
        }
        
    
        for (int j= 1; j <=i*2+1; j++)
    
        {
        cout<<"*";
        }
        for (int j = 1; j < n-i+1; j++)
        {
          cout<<" "; 
        }
        cout<<endl;
    }
    
}
int main()
{int n;
cout<<"enter the no.";
cin>>n;
print7(n);
}