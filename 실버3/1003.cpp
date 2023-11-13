// [1003] 피보나치 함수 / 실버3 / 10분

#include <iostream>
using namespace std;
int fibo[41];

int f(int n) {
    if(n < 1) return fibo[n];
    else if(fibo[n] == 0) fibo[n] = f(n - 1) + f(n - 2);
    return fibo[n];
}

int main() {
    int T; cin >> T;
    fibo[0] = 0; fibo[1] = 1;
    while(T--) {
        int n; cin >> n;
        if(n == 0) cout << "1 0\n";
        else cout << f(n - 1) << " " << f(n) << "\n";
    }
    return 0;
}
