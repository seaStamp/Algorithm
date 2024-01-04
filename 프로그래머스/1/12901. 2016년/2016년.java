class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] dayOfWeek = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] dayOfMonth = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i = 0; i < a - 1 ; i++){
            b += dayOfMonth[i]; 
        }
        answer = dayOfWeek[(b + 4) % 7];
        return answer;
    }
}