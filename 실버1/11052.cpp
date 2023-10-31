// [11052] 카드 구매하기 / 실버1 / 20분
#include <iostream>
using namespace std;

int main() {
    // 입력받기
    int N; cin >> N;
    int P[10001], PS[10001];
    for(int i = 1; i <= N; i++)
        cin >> P[i];
    PS[0] = 0, P[0] = 0;
    PS[1] = P[1];

    // ps[0] = 0
    // ps[1] = p[1]
    // ps[2] = max(ps[1] + p[1], ps[0] + p[2])
    // ps[3] = max(ps[2] + p[1], ps[1] + p[2], ps[0] + p[3])
    // ps[4] = max(ps[3] + p[1], ps[2] + p[2], ps[1] + p[3], ps[0] + p[4])
    // ps[N] = max(ps[i - j] + p[j], p[N])

    for(int i = 1; i <= N; i++)
        for(int j = 1; j <= i; j++)
            PS[i] = max(PS[i - j] + P[j], PS[i]);
    
    cout << PS[N] << endl;
    return 0;
}
