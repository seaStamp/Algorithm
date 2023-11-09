class Solution {
    public int solution(int angle) {
        switch (angle/90){
                case 0 ->{
                    return 1;
                }
                case 1 -> {
                    return (angle % 90 == 0)? 2 : 3;
                }
        }
        return 4;
    }
}