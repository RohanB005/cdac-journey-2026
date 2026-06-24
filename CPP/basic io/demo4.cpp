#include <iostream>
using namespace std;

int main()
{
    float BS, HRA, DA, GS, PF, NS;

    cout<<"Enter Basic Salary: ";
    cin>>BS;

    HRA = 0.15*BS;
    DA = 0.30*BS;
    GS = BS + HRA + DA;
    PF = 0.125 * GS;
    NS = GS - PF;

    cout<<"\nBasic Salary: "<<BS;
    cout<<"\nHRA: "<<HRA;
    cout<<"\nDA: "<<DA;
    cout<<"\nGross Salary: "<<GS;
    cout<<"\nPF: "<<PF;
    cout<<"\nNet Salary: "<<NS;

    return 0;
}