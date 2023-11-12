// [9252] LCS 2 / 골드4 / 15분

#include <iostream>
#include <string>
#include <cstring>
#include <algorithm>
using namespace std;

int leng[1001][1001];
int LCS(char *s, char *t, int m, int n) {
    memset(leng, 0, sizeof(leng));

    // base case 초기화
    for(int i = 0; i <= m; i++) leng[i][0] = 0;
    for(int i = 0; i <= n; i++) leng[0][i] = 0;

    for(int i = 1; i <= m; i++)
        for(int j = 1; j <= n; j++)
            if(s[i - 1] == t[j - 1])
                leng[i][j] = 1 + leng[i - 1][j - 1];
            else
                leng[i][j] = max(leng[i - 1][j], leng[i][j - 1]);
    return leng[m][n];
}

int main() {
    char s[1001], t[1001];
    cin >> s >> t;
    int m = strlen(s);  int n = strlen(t);
    int ans = LCS(s, t, m, n);
    cout << ans << "\n";
    if(ans > 0) {
        string str;
        while(m != 0 && n != 0)
            if(leng[m][n] == leng[m - 1][n]) m--;
            else if(leng[m][n] == leng[m][n - 1]) n--;
            else {
                str += s[m - 1];
                m--; n--;
                }
        reverse(str.begin(), str.end());
        cout << str << "\n";
    }
    return 0;
}
