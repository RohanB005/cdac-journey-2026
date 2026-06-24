#include<iostream>
#include<vector>
using namespace std;
class Item
{
    public:
        int id;
        string name;
        double price;
};
int main()
{
    vector<Item> cart;
    int choice;

    do
    {
        cout<<"1. Add Item: \n";
        cout<<"2. Display: \n";
        cout<<"3. Total Bill: \n";
        cout<<"4. Exit \n";

        cout<<"Enter choice: \n";
        cin>>choice;

        if(choice == 1)
        {
            Item it;
            cout<<"Enter id name price: ";
            cin>>it.id>>it.name>>it.price;

            try
            {
                if(it.price < 0)
                    throw "Invalid Price!";
                cart.push_back(it);
            }
            catch(const char* msg)
            {
                cout<<msg<<endl;
            }
        }
            else if(choice == 2) 
            {
            for(auto x : cart)
                cout<<x.id<<" "<<x.name<<" "<<x.price<<endl;
            }
            else if(choice == 3) 
            {
            double total = 0;
            for(auto x : cart)
                total += x.price;

            cout<<"Total Bill: "<<total<<endl;
        }
    } while (choice != 4);
    
}