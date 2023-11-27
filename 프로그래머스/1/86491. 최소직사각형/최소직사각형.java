class Solution {
    public int solution(int[][] sizes) {
        int w_max = 0;
        int h_max = 0;
        for(int i = 0; i < sizes.length; i++){
            if (sizes[i][0] > sizes[i][1]){
                swap(sizes,i);
            }
            w_max = (sizes[i][0] > w_max)? sizes[i][0] : w_max;
            h_max = (sizes[i][1] > h_max)? sizes[i][1] : h_max;
        }
        return w_max * h_max;
    }
    
    public void swap(int[][] numbers, int i){
        int tmp = numbers[i][0];
        numbers[i][0] = numbers[i][1];
        numbers[i][1] = tmp;
    }
}