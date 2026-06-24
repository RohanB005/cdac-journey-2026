#include<iostream>
using namespace std;
class Analyzer
{
    private:
        int *arr;
        int n;
    public:
        void input()
        {
            cout<<"Enter number of elements: ";
            cin>>n;

            arr = new int[n];

            cout<<"Enter "<<n<<"numbers\n";
            for(int i=0;i<n;i++)
            {
                cin>>arr[i];
            }
        }
        void findMax()
        {
            int max = arr[0];
            for(int i=1;i<n;i++)
            {
                if(arr[i] > max)
                    max = arr[i];
            }
            cout<<"Max: "<<max<<endl;
        }
        void findMin()
        {
            int min = arr[0];
            for(int i=1;i<n;i++)
            {
                if(arr[i] < min)
                    min = arr[i];
            }
            cout<<"Min: "<<min<<endl;
        }
        void findAverage()
        {
            int sum = 0;
            for(int i=0;i<n;i++)
            {
                sum += arr[i];
            }
            cout<<"Avg: "<<(float)sum/n<<endl;
        }
    ~Analyzer()
    {
        delete[] arr;
    }
};
int main()
{
    Analyzer a;
    a.input();
    a.findMax();
    a.findMin();
    a.findAverage();

    return 0;
}