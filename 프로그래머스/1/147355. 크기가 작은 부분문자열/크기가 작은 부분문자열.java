class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        long pInt = Long.parseLong(p);
        for(int i = 0; i < t.length() - size + 1; i++){
            if(Long.parseLong(t.substring(i,i + size)) <= pInt){
                answer++;
            }
        }
        return answer;
    }
}