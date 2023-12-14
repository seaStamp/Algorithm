import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int total = score.length;
        int[] answer = new int[total];
        for(int i = 0; i < score.length; i++){
            Arrays.sort(score, 0, i + 1);
            answer[i] = (i < k)? score[0] : score[i + 1 - k];
        }
        return answer;
    }
}