class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int strtR = 0;
        int strtC = 0;
        int endR = matrix.length-1;
        int r = matrix.length-1;
        int endC = matrix[0].length-1;
        int c = matrix[0].length-1;

        while(strtR<=endR && endC >= strtC){
            //top
            for(int j = strtC; j<=endC; j++){
                ans.add(matrix[strtR][j]);
            }
            //right
            for(int i = strtR+1; i<=endR; i++){
                ans.add(matrix[i][endC]);
            }
            //bottom
            for(int j = endC-1;j>=strtC; j--){
                if(strtR == endR){
                    break;
                }
                ans.add(matrix[endR][j]);
            }
            //left
            for(int i = endR-1; i>strtR; i--){
                if(strtC>= endC){
                    break;
                }
                ans.add(matrix[i][strtC]);
            }
            strtR++;
            endR--;
            strtC++;
            endC--;
        }
        return ans;
    }
}