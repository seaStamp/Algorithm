import java.lang.StringBuilder;

class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2; j++){
                answer.append(i);
            }
        }
        temp.append(answer);
        answer.append("0");
        return temp.append(answer.reverse()).toString();
    }
}