// Brutre Force solution:-
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int row = matrix.length;
//         int column = matrix[0].length;
//         for(int i = 0; i< row; i++){
//             for(int j = 0; j<column; j++){
//                 if(matrix[i][j] == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

//Optimal Solution:-
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c = matrix[0].length-1;
        int r = matrix.length;
        int e = matrix.length-1;
        int s = 0;
        while(s <= e){
            int mid = (s+e)/2;
            if(target >= matrix[mid][0] && target <= matrix[mid][c]){
                int s1 = 0;
                int e1 = matrix[0].length-1;
                while(s1 <= e1){
                    int mid1 = (s1+e1)/2;
                    if(matrix[mid][mid1] == target){
                        return true;
                    }
                    else if(matrix[mid][mid1] < target){
                        s1 = mid1+1;
                    }
                    else{
                        e1 = mid1-1;
                    }
                }
                return false;
            }
            else if(target > matrix[mid][c]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return false;
    }
}