import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        String result = Arrays.stream(String.valueOf(n).split(""))
                              .sorted(Comparator.reverseOrder())
                              .reduce("", (acc, s) -> acc + s);

        return Long.parseLong(result);
    }
}
