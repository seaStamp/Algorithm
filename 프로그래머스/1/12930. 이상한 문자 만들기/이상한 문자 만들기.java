class Solution {
    public String solution(String s) {
        char[] answer = s.toCharArray();
        int cnt = 0;
        
        for (int i = 0; i < answer.length; i++) {
            if(answer[i] == ' '){
                cnt = 0;
            } else{
            answer[i] = (cnt++ % 2 == 0)? Character.toUpperCase(answer[i]) : Character.toLowerCase(answer[i]);
            }
        }
        
        return String.valueOf(answer);
    }
}
