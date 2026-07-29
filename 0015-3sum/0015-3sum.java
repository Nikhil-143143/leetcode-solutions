// Brute Force Solution:-
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> ans = new ArrayList<>();
//         Set<List<Integer>> set = new HashSet<>();

//         for(int i = 0; i<nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 for(int k = j+1; k<nums.length; k++){
//                     if(nums[i]+nums[j]+nums[k] == 0){
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(nums[i]);
//                         temp.add(nums[j]);
//                         temp.add(nums[k]);
//                         Collections.sort(temp);
//                         if(!set.contains(temp)){
//                             set.add(temp);
//                             ans.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
// }

//Optimal Solution:-
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0) k--;
                else if(sum < 0) j++;
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
            }
        }
        return ans;
    }
}