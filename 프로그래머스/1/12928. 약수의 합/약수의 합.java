class Solution {
    public int solution(int n) {
        int answer = (n == 1)? 1 : 0;
        int max = n;
        for(int i = 1; i < max; i++){
            if (n % i == 0){
                max = n / i;
                answer += (i == max) ? i : i + max;
            }
        }
        return answer;
    }
}