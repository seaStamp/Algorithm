class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = calcGcd(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }
    
    int calcGcd (int num1, int num2){
        if (num2 == 0){
            return num1;
        }
        return calcGcd (num2, num1 % num2);
    }
}