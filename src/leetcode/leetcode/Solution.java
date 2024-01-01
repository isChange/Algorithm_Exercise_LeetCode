package leetcode.leetcode;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/10/2 14:33
 * @email liuyia2022@163.com
 * 题目地址：https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii
 */
public class Solution {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][0] - prices[i], dp[i-1][1]);
        }
        return  dp[prices.length - 1][0];
    }
}
