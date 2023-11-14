class Solution {
    public int solution(int num) {
        long collatzNum = num;
        for(int i = 0; i <= 500; i++){
            if(collatzNum == 1){
                return i;
            }
            collatzNum = (collatzNum % 2 == 0)? evenCalc(collatzNum) : oddCalc(collatzNum);
        }
        return -1;
    }
    
    private long evenCalc(long num){
        return num / 2;
    }
    
    private long oddCalc(long num){
        return (num * 3) + 1;
    }
}