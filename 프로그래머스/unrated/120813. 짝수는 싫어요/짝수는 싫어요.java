class Solution {
    public int[] solution(int n) {
        int len = n / 2 + n % 2;
        int[] answer = new int[len];
        
        for(; len > 0 ; len--){
            answer[len - 1] = 2 * len - 1;
        }
        
        return answer;
    }
}