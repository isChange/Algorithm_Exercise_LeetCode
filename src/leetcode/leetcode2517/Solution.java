package leetcode.leetcode2517;

import java.util.Arrays;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/6/3 21:29
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {

    }

    /**
     * 礼盒的最大甜蜜度
     * 问题： 给你一个正整数数组 price ，其中 price[i] 表示第 i 类糖果的价格，另给你一个正整数 k 。
     * 商店组合 k 类 不同 糖果打包成礼盒出售。礼盒的 甜蜜度 是礼盒中任意两种糖果 价格 绝对差的最小值。
     * 返回礼盒的 最大 甜蜜度。
     *
     * 例子：
     * 输入：price = [13,5,1,8,21,2], k = 3 输出：8
     * 解释：选出价格分别为 [13,5,21] 的三类糖果。
     * 礼盒的甜蜜度为 min(|13 - 5|, |13 - 21|, |5 - 21|) = min(8, 8, 16) = 8 。
     * 可以证明能够取得的最大甜蜜度就是 8 。
     * @param price
     * @param k
     * @return
     */
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        //甜度范围
        int left = 0;
        int right = price[price.length - 1] - price[0];
        //用二分不断寻找
        while(left <right){
            int mid = (left + right + 1) >> 1;
            if(check(price,k,mid)){
                left = mid;
            }else{
                right = mid - 1;
            }

        }
        return left;
    }
    public boolean check(int[] price , int k , int t){
        int prev = Integer.MIN_VALUE / 2;
        int count = 0;
        for(int p : price){
            if(p - prev >= t){
                prev = p;
                count++;
            }
        }
        return count >= k;


    }
}
