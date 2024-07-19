#include <iostream>
using namespace std;

int main() {
    int a[8];
    int min = 100; int sum = 0;

    for(int i = 0; i < 7; i++) {
        cin >> a[i];
        if(a[i] % 2 == 1) {
            sum += a[i];
            if(a[i] < min) min = a[i];
        }
    }
    if(sum == 0) cout << -1;
    else cout << sum << "\n" << min;
    return 0;
}