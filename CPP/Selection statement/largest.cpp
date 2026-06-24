/*#include<iostream>
using namespace std;
int main()
{
    int a, b, c, max;

    cout<<"Enter three numbers: ";
    cin>>a>>b>>c;

    max = (a>b)?(a>c ? a:c):(b>c ? b:c);
    cout<<"Maximum: "<<max;
    return 0;
}*/

#include<iostream>
using namespace std;
int main()
{
    int a, b, c, min;
    cout<<"Enter three numbers: ";
    cin>>a>>b>>c;

    min = (a<b)?(a<c ? a:c):(b<c ? b:c);
    cout<<"Minimum: "<<min;
    return 0;
}

