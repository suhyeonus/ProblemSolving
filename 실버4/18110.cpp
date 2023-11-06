// [18110] solved.ac / 실버4 / 30분

#include <iostream>
#include <cmath>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int n, cut;
    double score = 0;
    
    cin >> n;
    if(n == 0) cout << 0 << endl;
    else {
        vector<int> a(n);
        for(int i = 0; i < n; i++)
            cin >> a[i];

        sort(a.begin(), a.end());
        cut = round(n * 0.15);

        for(int i = cut; i < (n - cut); i++)
            score += a[i];
        score = round(score / (n - 2 * cut));
        cout << score;
    }
    return 0;
}
