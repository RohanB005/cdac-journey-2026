#include <iostream>
using namespace std;

// String Length
int strLength(char *str) {
    int len = 0;
    while (*(str + len) != '\0') len++;
    return len;
}

// String Copy
void strCopy(char *dest, char *src) {
    while (*src != '\0') {
        *dest = *src;
        dest++;
        src++;
    }
    *dest = '\0';
}

// String Concatenate
void strConcat(char *dest, char *src) {
    while (*dest != '\0') dest++;
    while (*src != '\0') {
        *dest = *src;
        dest++;
        src++;
    }
    *dest = '\0';
}

// String Compare
int strCompare(char *s1, char *s2) {
    while (*s1 && *s2) {
        if (*s1 != *s2)
            return *s1 - *s2;
        s1++; s2++;
    }
    return *s1 - *s2;
}

int main() {
    char str1[100] = "Hello";
    char str2[100] = "World";
    char copy[100];

    cout << "Length: " << strLength(str1) << endl;

    strCopy(copy, str1);
    cout << "Copied: " << copy << endl;

    strConcat(str1, str2);
    cout << "Concatenated: " << str1 << endl;

    cout << "Compare: " << strCompare("abc", "abd") << endl;

    return 0;
}