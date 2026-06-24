#include <iostream>
using namespace std;

class Outer {
    int x = 10;

public:
    class Inner {
    public:
        void show() {
            cout << "Inner class method\n";
        }
    };
};

int main() {
    Outer::Inner obj;
    obj.show();
    return 0;
}