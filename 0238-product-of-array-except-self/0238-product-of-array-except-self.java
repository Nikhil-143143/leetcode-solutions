// Time & Space complexity:- O(n)
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] prefix = new int[nums.length];
//         int[] suffix = new int[nums.length];
//         int j = nums.length-2;

//         prefix[0] = 1;
//         suffix[nums.length-1] = 1; 
//         for(int i = 1; i<nums.length; i++){
//             prefix[i] = prefix[i-1] *nums[i-1];
//             suffix[j] = suffix[j+1] *nums[j+1];
//             j--;
//         }
//         for(int i = 0; i< nums.length; i++){
//             nums[i] = prefix[i] * suffix[i];
//         }
//         return nums;
//     }
// }

// Time & Space complexity:- O(n) & O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;
        for(int i = 1; i<nums.length; i++){
            result[i] = result[i-1] *nums[i-1];
        }
        int suffix = 1;
        for(int i = nums.length-1; i>=0; i--){
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }
        return result;
    }
}