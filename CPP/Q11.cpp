#include <iostream>
using namespace std;

template <class T>
T add(T a, T b) {
    return a + b;
}

int main() {
    cout << add(5, 3) << endl;
    cout << add(2.5, 3.1) << endl;
    return 0;
}