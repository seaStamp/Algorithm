import java.util.ArrayList;

public class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<Long>();
        for (int i = 0; i < n; i++){
            answer.add((long)x * ( i + 1));
        }
        return answer.stream().mapToLong(a -> a).toArray();
    }
}