class Solution {
    public static int answer = 0;
    public static boolean[] isVisit;
    
    public int solution(int k, int[][] dungeons) {
        isVisit = new boolean[dungeons.length];
        
        DFS(k, 0, dungeons);
        
        return answer;
    }
    
    public void DFS(int k, int cnt, int[][] dungeons) {
        answer = Math.max(answer, cnt);
        for(int i = 0; i < dungeons.length; i++){
    	    if (isVisit[i] == false && k >= dungeons[i][0]) {
                isVisit[i] = true;
    		    DFS(k - dungeons[i][1], cnt + 1, dungeons);
                isVisit[i] = false;
            }
    	}
    }
}