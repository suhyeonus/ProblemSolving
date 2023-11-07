// [11729] 하노이 탑 이동 순서 / 골드5 / 30분

#include <iostream>
#include <cmath>
using namespace std;

void hanoi(int n, int a, int b, int c) {
    if(n == 1) {
        cout << a << " " << c << "\n";
        return;
    }
    hanoi(n - 1, a, c, b);
    cout << a << " " << c << "\n";
    hanoi(n - 1, b, a, c);
}

int main() {
    int n; cin >> n;
    cout << (1 << n) - 1 << "\n";
    hanoi(n, 1, 2, 3);
    return 0; 
}
