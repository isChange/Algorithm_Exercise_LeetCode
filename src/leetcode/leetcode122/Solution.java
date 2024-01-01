package leetcode.leetcode122;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/10/4 22:23
 * @email liuyia2022@163.com
 * 题目地址L:https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iii
 */
public class Solution {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int in1 = -prices[0] , out1 = 0 ,in2 = out1 - prices[0], out2 = 0;
        for (int i = 1; i < prices.length; i++) {
            in1 = Math.max(in1,out2 - prices[i]);
            out1 = Math.max(out1,in1 + prices[i]);
            in2 = Math.max(in2,out1 - prices[i]);
            out2 = Math.max(out2,in2 + prices[i]);
        }
        return out2;
    }
}
