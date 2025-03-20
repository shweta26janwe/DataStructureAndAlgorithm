#include <iostream>
using namespace std;

void square(int n)
{
    for (int i = n; i >= 1; i--)
    {
        for (int j = 1; j <= n; j++)
        {
            cout << "*";
        }
        cout << endl;
    }
}
void print10(int n)
{
    for (int i = 1; i <= 2 * n - 1; i++)
    {
        int star = i;
        if (i > n)
        {
            star = 2 * n - i;
        }
        for (int j = 1; j <= star; j++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void print10a(int n)
{
    for (int i = 0; i < n; i++)

    {
        for (int j = 0; j <= i; j++)
        {

            /* code */
            cout << "*";
        }
        cout << endl;
    }
    for (int i = 0; i < n - 1; i++)

    {
        for (int j = 0; j < (n - i) - 1; j++)
        {

            /* code */
            cout << "*";
        }
        cout << endl;
    }
}
void print11(int n)
{
    for (int i = 1; i <= n; i++)
    {
        int start = i % 2;
        if (start == 0)
        {

            for (int j = 1; j <= i; j++)
            {
                int end = j % 2;
                if (end == 0)
                {
                    cout << "1";
                }
                else
                {
                    cout << "0";
                }
            }
            cout << endl;
        }
        else
        {
            for (int j = 1; j <= i; j++)
            {
                int end = j % 2;
                if (end == 0)
                {
                    cout << "0";
                }
                else
                {
                    cout << "1";
                }
            }
            cout << endl;
        }
    }
}

void halfpybin(int n)
{
    int start = 1;
    for (int i = 0; i < n; i++)
    {
        if (i % 2 == 0)
        {
            start = 1;
        }
        else
        {
            start = 0;
        }
        for (int j = 0; j <= i; j++)
        {
            cout << start;
            start = 1 - start;
        }
        cout << endl;
    }
}
    int main()
    {
        int n;
        cout << "enter the no.";
        cin >> n;
        // square(n);
        print10(n);
        print10a(n);

        // halfpybin(n);
      
    }