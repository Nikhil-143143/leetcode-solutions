class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a = 0;
        int b = 0;
        int n = grid.length;
        int[] freq = new int[n*n+1];
        for(int i = 0; i< grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                freq[grid[i][j]]++;
            }
        }
        for(int i = 0; i< freq.length; i++){
            if(freq[i] > 1){
                a = i;
            }
            if(freq[i] == 0){
                b = i;
            }
        }
        return new int[]{a,b};
    }
}