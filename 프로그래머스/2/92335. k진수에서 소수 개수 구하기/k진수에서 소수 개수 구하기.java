class Solution {
    public int solution(int n, int k) {
        String[] kBaseNum = Long.toString(n, k).split("0");
        int primeCount = 0;
        
        for (String num : kBaseNum){
            if (num.equals("")){
                continue;
            }
            primeCount += (checkPrime(Long.parseLong(num)))? 1 : 0;
        }
        
        return primeCount;
    }
    
    public boolean checkPrime(long n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
        
    }
}