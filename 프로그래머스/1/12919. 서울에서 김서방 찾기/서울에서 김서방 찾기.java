import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        answer += Arrays.stream(seoul).collect(Collectors.toList()).indexOf("Kim")+"에 있다";
        return answer;
    }
}