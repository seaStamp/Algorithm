class Solution {
    public int solution(int num1, int num2) {
        boolean val = (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100);
        int answer = 0;
        
        if (val){
            answer = (int)((float)num1 / num2 * 1000);
        }
        
        return answer;
    }
}