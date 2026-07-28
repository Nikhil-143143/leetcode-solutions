//Brute force:- DO using merge sort or any sorting technique


// class Solution {
//     public void sortColors(int[] nums) {
        
//     }
// }


//Better solution:-


// class Solution {
//     public void sortColors(int[] nums) {
//         int cnt0=0,cnt1=0,cnt2=0;
//         for(int num:nums){
//             if(num==0) cnt0++;
//             else if(num==1) cnt1++;
//             else cnt2++;
//         }
//         int i = 0;
//         while(cnt0-- > 0) nums[i++]=0;
//         while(cnt1-- > 0) nums[i++]=1;
//         while(cnt2-- > 0) nums[i++]=2;
//     }
// }

//Optimal solution:- Using Dutch national flag algorithm.


class Solution {
    public void sortColors(int[] nums) {
        int low=0;int mid=0; int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}