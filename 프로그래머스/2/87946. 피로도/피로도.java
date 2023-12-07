class Solution {
    static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        int[] isVisit = new int[dungeons.length];
        
        DFS(k, 0, dungeons, isVisit);
        
        return answer;
    }
    
    public void DFS(int k, int cnt, int[][] dungeons, int[] isVisit) {
        answer = Math.max(answer, cnt);
        for(int i = 0; i < dungeons.length; i++){
    	    if (isVisit[i] == 0 && k >= dungeons[i][0]) {
                isVisit[i] = 1;
    		    DFS(k - dungeons[i][1], cnt + 1, dungeons, isVisit);
                isVisit[i] = 0;
            }
    	}
    }
}