package leetcode.leetcode1599;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/1 15:53
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {
        minOperationsMaxProfit(new int[]{8,3},5,6);
    }
    public static int minOperationsMaxProfit(int[] customers, int boardingCost, int runningCost) {
        int wait  = 0;
        int up = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int count = 0;
        int sum = 0;

        while(wait > 0 || i < customers.length){
            wait += i < customers.length ? customers[i] : 0;
            up = Math.min(wait , 4);
            wait -= up;
            sum += up*boardingCost - runningCost;
            i++;
            if(sum > max){
                max = sum;
                count = i;
            }
        }
        return max > 0 ? count : -1;
    }
}
