// [1546] 평균 / 브론즈1 / 5분

#include <iostream>
using namespace std;

int main() {
    int t; cin >> t;
    double m = -1, mean, a[1001];

    for(int i = 0; i < t; i++) {
        int tmp; cin >> tmp;
        a[i] = tmp;
        if(tmp > m) m = tmp;
    }

    for(int i = 0; i < t; i++) {
        a[i] /= m;
        mean += a[i] * 100;
    }

    cout << mean / t;

    return 0;
}
