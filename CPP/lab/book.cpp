#include<iostream>
using namespace std;
class Book
{
    private:
        int bookId;
        string title;
        string author;
        double price;
    public:
        Book()
        {
            int bookId = 0;
            string title = "";
            string author = "";
            double price = 0.0;
        }
        void input()
        {
            cout<<"Enter Book id: ";
            cin>>bookId;
            cout<<"Enter Title: ";
            cin>>title;
            cout<<"Enter Author: ";
            cin>>author;
            cout<<"Enter Price: ";
            cin>>price;
        }
        void display()
        {
            cout<<"bookId: "<<bookId<<endl;
            cout<<"Title: "<<title<<endl;
            cout<<"Author: "<<author<<endl;
            cout<<"Price: "<<price<<endl;
            cout<<"-------------------------"<<endl;
        }
};
int main()
{
    Book b[4];
    for(int i=0;i<4;i++)
    {
        cout<<"Enter book details: "<<endl;
        b[i].input();
    }
    for(int i=0;i<4;i++)
    {
        cout<<"Book Details"<<endl;
        b[i].display();
    }
    return 0;
}
