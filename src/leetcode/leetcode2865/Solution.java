package leetcode.leetcode2865;

import java.util.List;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/24 20:18
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {

    }
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < maxHeights.size(); i++) {
            max = Math.max(max,getMax(maxHeights,i));
        }
        return max;
    }

    public long getMax(List<Integer> high,int top){
        Integer[] temp = high.toArray(new Integer[0]);
        for (int i = top + 1; i < high.size(); i++) {
            temp[i] = temp[i] <= temp[i - 1] ? temp[i] : temp[i - 1];
        }
        for (int i = top - 1; i >= 0; i--) {
            temp[i] = temp[i] <= temp[i  + 1] ? temp[i] : temp[i + 1];
        }
        long sum = 0L;
        for (Integer integer : temp) {
            sum += integer;
        }
        return sum;
    }
}
