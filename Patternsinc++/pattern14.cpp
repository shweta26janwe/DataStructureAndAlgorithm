#include<bits/stdc++.h>
using namespace std;

void print14(int n)
{
    for (int i = 0; i<n; i++)
    {
        for (char ch='A';ch<='A'+i;ch++)
        {
            cout << ch <<" ";
        }
        cout << endl;
    }
}
void print15(int n)
{for(int i=0;i<n;i++)
    // for (int i = n; i>0; i--)
    {   for(char ch='A';ch<='A'+n-i-1;ch++)
        // for (char ch='A';ch<'A'+i;ch++)
        {
            cout << ch <<" ";
        }
        cout << endl;
    }
}
void print16(int n)
{char ch='A';
    for (int i = 0; i<n; i++)
    {
        
        for(int j=0;j<=i;j++)
        {
            cout << ch <<" ";
        }
        cout << endl;
        ch++;
    }
}
void print18(int n)
{
    for (int i = 0; i<n; i++)
    {
        for (char ch='E'-i;ch<='E';ch++)
        {
            cout << ch <<" ";
        }
        cout << endl;
    }
}
    int main()
    {
        int n;
        cout << "enter the no.";
        cin >> n;
        print18(n);

        
    }