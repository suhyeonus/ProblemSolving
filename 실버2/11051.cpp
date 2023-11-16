// [11051] 이항 계수 2 / 실버2 / 10분

#include <iostream>
using namespace std;

int dp[1001][1001];

int main() {
    int n, k; cin >> n >> k;
    for(int i = 0; i <= n; i++)
        for(int j = 0; j <= min(i, k); j++)
            if(j == 0 || j == i) dp[i][j] = 1;
            else {
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                dp[i][j] %= 10007;
            }

    cout << dp[n][k];
    return 0;
}
