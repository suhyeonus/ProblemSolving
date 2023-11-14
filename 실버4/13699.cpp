// [13699] 점화식 / 실버4 / 5분

#include <iostream>
using namespace std;
unsigned long long int dp[36];

int main() {
    dp[0] = 1;
    int n; cin >> n;
    for(int i = 1; i <= n; i++)
        for(int n = 1; n <= i; n++) 
            dp[i] += dp[n - 1] * dp[i - n]; 
    cout << dp[n];
    return 0;
}
