class Solution {
    public int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        
        DFS(target, numbers, 0, 0);
        
        return answer;
    }
    
    public void DFS(int target, int[] numbers, int depth, int sum) {
        if (depth == numbers.length){
            if (sum == target){
                answer++;
            }
        } else {
            DFS(target, numbers, depth + 1, sum + numbers[depth]);
            DFS(target, numbers, depth + 1, sum - numbers[depth]);
        }
    }
}