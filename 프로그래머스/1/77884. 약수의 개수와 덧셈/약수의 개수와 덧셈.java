class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        while(left <= right) {
            answer += (left % Math.sqrt(left) == 0)? -left : left;
            left++;
        }
        return answer;
    }
}