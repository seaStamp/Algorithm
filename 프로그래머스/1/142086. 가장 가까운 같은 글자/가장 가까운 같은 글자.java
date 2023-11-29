class Solution {
    public int[] solution(String s) {
        int[] alphabet = new int[26];
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(alphabet[s.charAt(i) - 'a'] == 0){
                answer[i] = -1;
            } else {
                answer[i] = i + 1 - alphabet[s.charAt(i) - 'a'];
            }
            alphabet[s.charAt(i) - 'a'] = i + 1;
        }
        return answer;
    }
}