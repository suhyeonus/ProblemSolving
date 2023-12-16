// [11047] 동전 0 / 실버4 / 5분
// 동전들이 배수 관계이기 때문에 단순 계산 가능

#include <iostream>
using namespace std;

int main() {
    int n, k, ans = 0; cin >> n >> k;
    int a[11]; for(int i = 0; i < n; i++) cin >> a[i];
    for(int i = n - 1; i >= 0; i--) {
        ans += k / a[i];
        k %= a[i];
    }
    cout << ans;
    return 0;
}
