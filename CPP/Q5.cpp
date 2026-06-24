#include <iostream>
using namespace std;

class Date {
    int d, m, y;
public:
    Date(int dd, int mm, int yy) : d(dd), m(mm), y(yy) {}

    void display() {
        cout << d << "/" << m << "/" << y << endl;
    }

    Date operator+(int days) {
        return Date(d + days, m, y);
    }
};

class Time {
    int h, m, s;
public:
    Time(int hh, int mm, int ss) : h(hh), m(mm), s(ss) {}

    void display() {
        cout << h << ":" << m << ":" << s << endl;
    }

    Time operator+(int sec) {
        return Time(h, m, s + sec);
    }
};

int main() {
    Date d(10, 3, 2025);
    Time t(10, 20, 30);

    d.display();
    t.display();

    d = d + 5;
    t = t + 30;

    d.display();
    t.display();

    return 0;
}