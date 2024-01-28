package leetcode2859;

import java.util.List;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/25 21:25
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {

    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += Integer.bitCount(i) == k ? nums.get(i) : 0;
        }
        return sum;
    }
}
