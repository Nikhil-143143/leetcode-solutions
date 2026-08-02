//Brute force :- In brute force , we do with recursion but its time complexity goes wild or insane. So, we don't do this . In brute case time complexity goes to ~~N! * N.

//Optimal solution :-
class Solution {
    public void nextPermutation(int[] nums) {
        int indx = -1;
        for(int i = nums.length-2; i>= 0; i--){
            if(nums[i]<nums[i+1]){
                indx = i;
                break;
            }
        }
        if(indx == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        // swap(nums, i, j);
        // reverse(nums, start, end);
        for(int i = nums.length-1; i>= 0 ; i--){
            if(nums[i] > nums[indx]){
                swap(nums , i , indx);
                break;
            }
        }
        reverse(nums, indx+1 , nums.length-1);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
