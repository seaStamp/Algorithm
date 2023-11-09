class Solution {
    public int solution(int n) {
        if(n % 2 != 0)
            n = n - 1;
        return n * (n + 2) / 4;
    }
}