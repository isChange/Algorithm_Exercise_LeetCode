package leetcode.leetcode1686;

import java.util.Arrays;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/2/2 20:23
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {

    }
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int n = aliceValues.length;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        Arrays.sort(arr,(i,j)->aliceValues[j] + bobValues[j] - aliceValues[i] - bobValues[i]);
        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += i % 2 == 0 ? aliceValues[arr[i]] : -bobValues[arr[i]];
        }
        if (ans == 0) {
            return 0;
        }
        return ans > 0 ? 1 : -1;
    }
}
