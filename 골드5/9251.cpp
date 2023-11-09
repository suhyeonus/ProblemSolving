// [9251] LCS / 골드5 / 10분

#include <iostream>
#include <cstring>
using namespace std;
int dp[1001][1001];

int LCS(char *A, char *B, int m, int n) {
    for(int i = 0; i <= m; i++) dp[i][0] = 0;
    for(int i = 0; i <= n; i++) dp[0][i] = 0;

    for(int i = 1; i <= m; i++)
        for(int j = 1; j <= n; j++) {
            if(A[i - 1] == B[j - 1]) dp[i][j] = 1 + dp[i - 1][j - 1];
            else dp[i][j] = max(dp[i][j - 1], dp[i - 1][j]);
        }
    return dp[m][n];
}

int main() {
    char A[1001], B[1001];
    scanf("%s", &A);
    scanf("%s", &B);
    cout << LCS(A, B, strlen(A), strlen(B));
    return 0;
}
