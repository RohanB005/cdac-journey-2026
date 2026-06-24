#include<iostream>
using namespace std;
int main()
{
    int choice;
    float balance = 1000;
    int amt;
    do
    {
        cout<<"=========MENU==========="<<endl;
        cout<<"1. Check Balance\n";
        cout<<"2. Deposit Money\n";
        cout<<"3. Withdraw Money\n";
        cout<<"4. Exit\n";

        cout<<"Enter choice\n";
        cin>>choice;

        switch (choice)
        {
        case 1:
            cout<<"Current Bal: "<<balance<<endl;
            break;
        
        case 2:
            cout<<"Enter AMT to depo: ";
            cin>>amt;
            balance += amt;
            cout<<"Amt Depo: "<<endl;
            break;
        
        case 3:
            cout<<"Enter AMT to withdraw: ";
            cin>>amt;
            if(amt <= balance)
            {
                balance -= amt;
                cout<<"Amt withdrawn";
            }
            else
            {
                cout<<"Insufficient Bal";
            }
            break;
        
        case 4:
            cout<<"Exiting..."<<endl;
            break;
        default:
            cout<<"Invalid choice"<<endl;
            break;
        }
    } while (choice!=4);
    return 0;
}