class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        answer = (a < b)?(b - a + 1):( a - b + 1);
        answer = answer * (a + b)/2;
        return answer;
    }
}