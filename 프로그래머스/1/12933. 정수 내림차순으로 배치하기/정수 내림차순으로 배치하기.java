import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] answer = String.valueOf(n).toCharArray();
        Arrays.sort(answer);
        return Long.parseLong(new StringBuilder(new String(answer)).reverse().toString());
    }
}
