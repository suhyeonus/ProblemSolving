// [9461] 파도반 수열 / 실버3 / 10분

#include <iostream>
using namespace std;
unsigned long long n[101];

int main() {
    n[0] = n[1] = n[2] = 1;
    int T; cin >> T;
    while(T--) {
        int p; cin >> p;
        for(int i = 3; i < p; i++)
            n[i] = n[i - 3] + n[i - 2];
        cout << n[p - 1] << endl;
    }
    return 0;
}
