// [1259] 팰린드롬수 / 브론즈1 / 10분

#include <iostream>
#include <string>
using namespace std;

int p(string st, int i, int j) {
    if(i >= j) return 1;
    else if(st[i] != st[j]) return 0;
    else return p(st, i + 1, j - 1);
}

int main() {
    while(true) {
        int s; cin >> s;
        if(s == 0) break;

        string st = to_string(s);
        if (p(st, 0, st.length() - 1) == 1) cout << "yes\n";
        else cout << "no\n";
    }
    return 0;
}
