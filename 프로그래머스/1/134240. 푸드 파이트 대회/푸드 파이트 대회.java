import java.lang.StringBuilder;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i < food.length; i++){
                sb.append(String.valueOf(i).repeat(food[i]/2));            
        }
        answer.append(sb);
        sb.append("0");
        return answer.append(sb.reverse()).toString();
    }
}