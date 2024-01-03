class Solution {
    
    String word;
    int answer;
    int count = 0;
    String[] dict = new String[]{"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        this.answer = 0;
        this.word = word;
        String initString = "";
        dfs(initString);
        return answer;
    }
    
    public void dfs(String initString) {
        if (initString.equals(word)) {
            answer = count;
            return;
        }
        
        if (initString.length() == 5) {
            return;
        }
        
        for (int i = 0; i < dict.length; i++) {
            count++;
            dfs(initString + dict[i]);
        }
    }
}