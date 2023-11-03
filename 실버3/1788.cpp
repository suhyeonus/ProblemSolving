// [1788] 피보나치 수의 확장 / 실버3 / 25분 

#include <iostream>
using namespace std;

unsigned long long int f[1000001] = {0, 1, 0};

int exFibo(int n) {
    if(n == 0 || n == 1) return n;
    else {
        if(n < 0) n *= -1;
        for(int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            f[i] %= 1000000000;
        }       
        return f[n] % 1000000000;
    }
}

int main() {
    int n, sign;  cin >> n;
    int ans = exFibo(n);
    if(n > 0) sign = 1;
    else if ((n * -1) % 2 == 1) sign = 1;
    else if(n == 0) sign = 0;
    else sign = -1;  
    cout << sign << '\n' << ans << endl;
    return 0;
}
