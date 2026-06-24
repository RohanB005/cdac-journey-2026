#include<iostream>
using namespace std;
int main()
{   
    int m1, m2, m3, m4, m5;
    int sum;
    float avg;

    cout<<"Enter marks of 5 subjects: \n";
    cin>>m1>>m2>>m3>>m4>>m5;

    sum = m1 + m2 + m3 + m4 + m5;
    avg = (float)sum / 5;

    cout<<"\nSum: "<<sum;
    cout<<"\nAverage: "<<avg;

    return 0;

}