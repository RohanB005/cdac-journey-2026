#include<iostream>
using namespace std;
int main()
{
    int n, i, j;
    char ch;
    cout<<"Enter a number: ";
    cin>>n;

    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n-i;j++)
        cout<<" ";

        ch = 'A';
        for(j=1;j<=i;j++)
        {
            cout<<ch;
            ch++;
        }
        ch = 'A' + i - 2;
        for(j=1;j<i;j++)
        {
            cout<<ch;
            ch--;
        }
        cout<<endl;
    }
}