#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ofstream fout("data.txt");
    fout << "Hello File";
    fout.close();

    ifstream fin("data.txt");
    string data;
    fin >> data;
    cout << data;
    fin.close();

    return 0;
}