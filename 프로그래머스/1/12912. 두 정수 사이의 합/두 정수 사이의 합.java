class Solution {
    public long solution(int a, int b) {
        if (a == b) return a;
        else if ((a+b)%2 == 0)
            return (long)(a+b) * (long)(Math.abs((long)(a-b))/2) + (long)(a+b)/2;
        else return (long)(a+b) * ((long)Math.abs(a-b)/2 + 1);
    }
}