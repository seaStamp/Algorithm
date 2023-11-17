class Solution {
    public String solution(String s) {
        int strSize = s.length();
        String answer = s.substring( strSize / 2 + ((strSize % 2 == 0) ? - 1 : 0), strSize / 2 + 1);
        return answer;
    }
}