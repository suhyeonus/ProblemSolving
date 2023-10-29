// [2748] 피보나치 수 2 / 브론즈1 / 3분

#include <iostream>
using namespace std;
unsigned long long int fibo[91];

int main() {
    int n; cin >> n;
    fibo[0] = 0; fibo[1] = 1;
    for(int i = 2; i <= n; i++)
        fibo[i] = fibo[i - 1] + fibo[i - 2];
    cout << fibo[n] << endl;
}
