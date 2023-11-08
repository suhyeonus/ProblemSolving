// [2164] 카드2 / 실버4 / 15분

#include <iostream>
#include <queue>
using namespace std;

int main() {
    int front, n; cin >> n;
    queue<int> q;

    for(int i = 1; i <= n; i++)
        q.push(i);
    
    while(q.size() > 1) {
        q.pop();
        front = q.front();
        q.pop();
        q.push(front);
    }
    cout << q.front();
    return 0;
}
