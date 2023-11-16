import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1){
            return new int[]{-1};
        }
        
        List<Integer> answer = new ArrayList<>();
        for(int i : arr){
            answer.add(i);
        }
        answer.remove(Collections.min(answer));
        return answer.stream().mapToInt(i -> i).toArray();
    }
}