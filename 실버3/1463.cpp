// [1463] 1로 만들기 / 실버3 / 15분

#include <iostream>
using namespace std;
// 배열 범위 오버됨 (약 25만까지?)
// 전역변수로 바꾸니 해결
int dp[1000001];

int main()
{
    int n;  cin >> n;
    dp[1] = 0; dp[2] = 1; dp[3] = 1;
    for(int i = 4; i <= n; i++) {
        // dp[i] = dp[i - 1] + 1이거나
        // dp[i] = dp[i/2] + 1이거나
        // dp[i] = dp[i/3] + 1이거나
        dp[i] = dp[i - 1] + 1;
        if(i % 2 == 0) dp[i] = min(dp[i], dp[i / 2] + 1);
        if(i % 3 == 0) dp[i] = min(dp[i], dp[i / 3] + 1);
    }
    cout << dp[n] << endl;
    return 0;
}
