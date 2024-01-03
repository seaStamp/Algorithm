class Solution {
    
    String word;
    int count = 0;
    int answer;
    
    public int solution(String word) {
        this.word = word;
        dfs("");
        return answer;
    }
    
    public void dfs(String temp) {
        
        if (temp.equals(word)) {
            answer = count;
        }
        
        if (temp.length() == 5) {
            return;
        }
        
        for (int i = 0; i < 5; i++) {
            count++;
            dfs(temp + "AEIOU".charAt(i));
        }
    }
}