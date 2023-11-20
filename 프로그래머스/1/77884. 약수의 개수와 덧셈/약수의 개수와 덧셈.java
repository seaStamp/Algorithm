class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        while(left <= right) {
            answer += (countDivisor(left) % 2 == 0)?left:-left;
            left++;
        }
        return answer;
    }
    
    public int countDivisor(int num){
        int count = 0;
        int sqrt = (int) Math.sqrt(num);
        for(int i = 1; i <= sqrt ; i++){
            if(num % i == 0){
                count += (num / i == i) ? 1 : 2;
            }
        }
        return count;
    }
}