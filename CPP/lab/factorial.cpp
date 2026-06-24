#include<iostream>
using namespace std;
class FindFactorial{
    private:
        int n;
        long long fact;
    public:
        void input()
        {
            cout<<"Enter number: ";
            cin>>n;
        }
        void calculate()
        {
            fact = 1;
            for(int i=1;i<=n;i++)
                fact *= i;
        }
        void display()
        {
            cout<<"Factorial: "<<fact;
        }
};
int main()
{
    FindFactorial f;
    f.input();
    f.calculate();
    f.display();
}