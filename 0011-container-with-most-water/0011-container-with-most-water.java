//Brute Force Solution:-

// class Solution {
//     public int maxArea(int[] height) {
//         int area = 0;
//         for(int i = 0; i< height.length;i++){
//             for(int j = i+1; j< height.length; j++){
//                 int previous_area = area;
//                 area = Math.min(height[i], height[j]) * (j-i);
//                 if(previous_area > area){
//                     area = previous_area;
//                 }
//             }
//         }
//         return area;
//     }
// }



//Optimal Solution:-
class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int area = Math.min(height[lp], height[rp]) * (rp - lp); 
        while(lp<rp){
            if(height[lp] > height[rp]){
                rp--;
            }
            else{
                lp++;
            }
            area = Math.max(area,(Math.min(height[lp], height[rp]) * (rp - lp)));
        }
        return area;
    }
}