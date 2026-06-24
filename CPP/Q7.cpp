#include <iostream>
using namespace std;

class Printer {
public:
    virtual void print() = 0;
};

class Inkjet : public Printer {
public:
    void print() {
        cout << "Inkjet printing\n";
    }
};

class Laser : public Printer {
public:
    void print() {
        cout << "Laser printing\n";
    }
};

int main() {
    Printer *p;
    Inkjet i;
    Laser l;

    p = &i;
    p->print();

    p = &l;
    p->print();

    return 0;
}