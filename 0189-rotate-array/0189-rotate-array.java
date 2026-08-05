// class Solution {
//     public void rotate(int[] nums, int k) {
//         int size = nums.length;
//         k = k % size;
//         int temp[] = new int[size - k];
//         for(int i = 0;i<size-k;i++){
//             temp[i] = nums[i];
//         }
//         for(int i = 0; i<k ;i++){
//             nums[i] = nums[size-k+i]; 
//         }
//         for(int i = k;i < size ;i++){
//             nums[i] = temp[i-k];
//         }
//     }
// }

// Optimal solution:---------------

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        
        //reverse the full array
        reverse(nums,0,n-1);
        
        //reverse first k elements
        reverse(nums,0,k-1);

        //reverse n- k elements
        reverse(nums,k,n-1);
        
    }
    static void reverse(int nums[],int start,int end){
        while(end>start){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}