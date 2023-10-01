package leetcode.leetcode605;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/9/30 12:46
 * @email liuyia2022@163.com
 * 题目地址url: https://leetcode.cn/problems/can-place-flowers
 */
public class Solution {
    public static void main(String[] args) {
        canPlaceFlowers(new int[]{1, 0, 0,0, 1}, 2);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i + 1 <= flowerbed.length - 1 && flowerbed[i + 1] == 1) {
                    continue;
                }
                if (i - 1 >= 0 && flowerbed[i - 1] == 1) {
                    continue;
                }
                count += 1;
                flowerbed[i] = 1;
            }
        }
        return count >= n;
    }
}
