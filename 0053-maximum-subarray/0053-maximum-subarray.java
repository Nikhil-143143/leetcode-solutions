// Brute force:-  But in this case its exceec time limit. so don't use in this case
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int lar = Integer.MIN_VALUE;
//         for(int i = 0 ;i<nums.length;i++){
//             int temp = 0;
//             for(int j = i; j< nums.length;j++){
//                 temp = temp + nums[j];
//                 if(temp > lar){
//                     lar = temp;
//                 }
//             }
//         }
//         return lar;
//     }
// }

//Optimal solution
class Solution {
    public int maxSubArray(int[] nums) {
        int lar = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ;i<nums.length;i++){
            sum += nums[i];
            if(sum > lar){
                lar = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return lar;
    }
}