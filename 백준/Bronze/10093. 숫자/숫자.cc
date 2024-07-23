#include <iostream>
using namespace std;

int main() {
    unsigned long long a, b, x, y; cin >> x >> y;
    if(x < y) {
        a = x;
        b = y;
    } else {
        a = y;
        b = x;
    }
    if(a == b) {cout << 0 << "\n";}
    else {
        cout << b-a-1 << "\n";
        for(unsigned long long i = a+1; i < b; i++) {
            cout << i;
            if(i != b-1) cout << " ";
        }
    }
    return 0;
}