#include <iostream>
using namespace std;

long long gdc(long long x, long long y) {
    if(x % y == 0) return y;
    return gdc(y, x % y);
}

int main()
{
    long long a, b;
    cin >> a >> b;
    long long answer = gdc(a, b);
    for(int i = 0; i < answer; i++)
        cout << "1";
    cout << endl;
    return 0;
}
