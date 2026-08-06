// //Good approach by me:- But wrong because we don't have marker.
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int r = matrix.length;
//         int c = matrix[0].length;
//         for(int i = 0; i<matrix.length; i++){
//             for(int j = 0; j<matrix[0].length; j++){
//                 if(matrix[i][j] == 0){
//                     matrix[i][j] = 'a';
//                 }
//             }
//         }
//         for(int i = 0; i<matrix.length; i++){
//             for(int j = 0; j<matrix[0].length; j++){
//                 if(matrix[i][j] == 'a'){
//                     int ii = i;
//                     int jj = j;
//                     matrix[ii][jj] = 0;
//                     while(ii < r){
//                         if(matrix[ii][j] =='a'){
//                             ii++;
//                             continue;
//                         }
//                         matrix[ii][j] = 0;
//                         ii++;
//                     }
//                     ii = i;
//                     while(ii >= 0){
//                         if(matrix[ii][j] =='a'){
//                             ii--;
//                             continue;
//                         }
//                         matrix[ii][j] = 0;
//                         ii--;
//                     }
//                     while(jj < c){
//                         if(matrix[i][jj] =='a'){
//                             jj++;
//                             continue;
//                         }
//                         matrix[i][jj] = 0;
//                         jj++;
//                     }
//                     jj = j;
//                     while(jj >= 0){
//                         if(matrix[i][jj] =='a'){
//                             jj--;
//                             continue;
//                         }
//                         matrix[i][jj] = 0;
//                         jj--;
//                     }
//                 }
//             }
//         }
//     }
// }

//Optimal Solution:-
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean firstrowZero = false;
        boolean firstcolumnZero = false;

        for(int j = 0; j< n; j++){
            if(matrix[0][j] == 0){
                firstrowZero = true;
                break;
            }
        }

        for(int i = 0; i<m; i++){
            if(matrix[i][0] == 0){
                firstcolumnZero = true;
                break;
            }
        }

        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i<m; i++){
            for(int j = 1; j<n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstrowZero){
            for(int k = 0; k<n; k++){
                matrix[0][k] = 0;
            }
        }

        if(firstcolumnZero){
            for(int k = 0; k<m; k++){
                matrix[k][0] = 0;
            }
        }
    }
}