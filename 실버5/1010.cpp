// [1010] 다리 놓기 / 실버5 / 20분

#include <iostream>
#include <cstring>
using namespace std;

long long int dp[31][31];
int main() {
    int t; cin >> t;
    while(t--) {
        int m, n; cin >> m >> n;
        if(m == n) cout << "1\n";
        else {
            memset(dp, 0, sizeof(dp));

            // base case
            for(int i = 2; i <= m; i++)
                dp[i][i] = 1;
            for(int i = 1; i <= n; i++)
                dp[1][i] = i;

            for(int i = 2; i <= m; i++)
                for(int j = i; j <= n; j++)
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
            
            cout << dp[m][n] << "\n";
        }
    }
    return 0;
}
