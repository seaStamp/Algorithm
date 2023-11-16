import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
    	if (arr.length == 0){
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        int[] answer = Arrays.stream(arr).filter(i -> i != min).toArray();
        return answer;
    }
}