//Brute force:-

// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             int cnt=0;
//             for(int j=0;j<n;j++){
//                 if(nums[i]==nums[j]){
//                     cnt++;
//                 }
//             }
//             if(cnt>n/2){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }

//Better solution:-

// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer, Integer>mpp = new HashMap<>();

//         for(int i = 0;i<nums.length;i++){
//             int value = mpp.getOrDefault(nums[i],0);
//             mpp.put(nums[i],value+1);
//         }

//         for(Map.Entry<Integer, Integer>it : mpp.entrySet()){
//             if(it.getValue()>(nums.length/2)){
//                 return it.getKey();
//             }
//         }
//         return -1;
//     }
// }

//Optimal solution:-

class Solution {
    public int majorityElement(int[] nums) {
        int cnt0 = 0;
        int el = 0;
        int cnt1 = 0;
        for(int i = 0;i<nums.length;i++){
            if(cnt0 == 0){
                el= nums[i];
                cnt0++;
            }
            else if(el == nums[i]){
                cnt0++;
            }
            else{
                cnt0--;
            }
        }
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == el) cnt1++;
        }
        if(cnt1>(nums.length/2)){
            return el;
        }
        return -1;
    }
}