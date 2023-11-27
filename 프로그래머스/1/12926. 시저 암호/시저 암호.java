class Solution {
    public String solution(String s, int n) {
        char[] answer = s.toCharArray();
        for(int i = 0; i < answer.length; i++){
            if (answer[i] == ' '){
                continue;
            }
            if (answer[i] >= 'A' && answer[i] <='Z'){
                answer[i] += (answer[i] + n > 'Z') ?  n - 26 : n;
            }
            if (answer[i] >= 'a' && answer[i] <='z'){
                answer[i] += (answer[i] + n > 'z') ? n - 26 : n;
            }
        }
        return new String(answer);
    }
}