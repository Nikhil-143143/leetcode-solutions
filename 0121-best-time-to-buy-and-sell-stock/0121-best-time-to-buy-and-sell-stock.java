//Brute Force
// class Solution {
//     public int maxProfit(int[] prices) {
//         int maxPro = 0;

//         for (int i = 0; i < prices.length; i++) {
//             for (int j = i + 1; j < prices.length; j++) {
//                 if (prices[j] > prices[i]) {
//                     maxPro = Math.max(prices[j] - prices[i], maxPro);
//                 }
//             }
//         }

//         return maxPro;
//     }
// }



//Optimal force
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }
}
