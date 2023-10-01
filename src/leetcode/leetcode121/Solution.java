package leetcode.leetcode121;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/10/1 17:33
 * @email liuyia2022@163.com
 * 题目地址:https://leetcode.cn/problems/best-time-to-buy-and-sell-stock
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min){
                    min = prices[i];
            }else {
                ans = Math.max(ans,prices[i] - min);
            }
        }
        return ans;
    }
}
