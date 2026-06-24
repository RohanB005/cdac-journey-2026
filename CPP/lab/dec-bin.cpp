#include<iostream>
using namespace std;

class DecimalToBinary {
private:
    int num;

public:
    void input() {
        cout<<"Enter decimal number: ";
        cin>>num;
    }

    void convert() {
        int binary[32], i=0;

        while(num > 0) {
            binary[i++] = num % 2;
            num /= 2;
        }

        cout<<"Binary: ";
        for(int j=i-1;j>=0;j--)
            cout<<binary[j];
    }
};

int main() {
    DecimalToBinary d;
    d.input();
    d.convert();
}