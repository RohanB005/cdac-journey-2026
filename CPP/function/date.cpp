#include<iostream>
using namespace std;
    void getDate(int &d, int &m, int &y)
    {
        cout<<"Enter date(dd mm yy): ";
        cin>>d>>m>>y;
    }
int main()
{
    int day, month, year;
    getDate(day, month, year);

    cout<<"Formatted date: ";
    cout<<day<<"/"<<month<<"/"<<(year % 100);
    return 0;
}

