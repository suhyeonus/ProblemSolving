// [14495] 피보나치 비스무리한 수열 / 실버4 / 2분

#include <iostream>
using namespace std;
unsigned long long int dp[117];

int main() {
    dp[0] = dp[1] = dp[2] = 1;
    int n; cin >> n;
    for(int i = 3; i < n; i++) dp[i] = dp[i - 1] + dp[i - 3];
    cout << dp[n - 1];
    return 0;
}
