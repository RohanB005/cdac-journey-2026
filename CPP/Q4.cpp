#include <iostream>
using namespace std;

class Printer {
protected:
    int speed;
public:
    Printer() { speed = 10; }
};

class Scanner {
protected:
    int resolution;
public:
    Scanner() { resolution = 300; }
};

class AllInOne : public Printer, public Scanner {
public:
    friend void show(AllInOne obj);
};

void show(AllInOne obj) {
    cout << "Speed: " << obj.speed << endl;
    cout << "Resolution: " << obj.resolution << endl;
}

int main() {
    AllInOne obj;
    show(obj);
    return 0;
}