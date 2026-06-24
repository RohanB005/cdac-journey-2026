#include<iostream>
using namespace std;
class SortArray
{
    private:
        int arr[5];
    public:
        void input()
        {
            cout<<"Enter 5 elements: \n";
            for(int i=0;i<5;i++)
            {
                cin>>arr[i];
            }
        }
        void sortArray()
        {
            for(int i=0;i<5;i++)
            {
                for(int j=i+1;j<5;j++)
                {
                    if(arr[i]>arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        void display()
        {
            cout<<"Sorted Array: \n";
            for(int i=0;i<5;i++)
            {
                cout<<arr[i]<<" ";
            }
        }
};
int main()
{
    SortArray s;
    s.input();
    s.sortArray();
    s.display();
}