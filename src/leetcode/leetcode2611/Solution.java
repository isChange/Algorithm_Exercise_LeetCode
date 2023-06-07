package leetcode.leetcode2611;

import java.util.Arrays;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/6/7 22:50
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {

    }

    /**
     * 2611. 老鼠和奶酪
     *
     * 有两只老鼠和 n 块不同类型的奶酪，每块奶酪都只能被其中一只老鼠吃掉。
     * 下标为 i 处的奶酪被吃掉的得分为：
     * 如果第一只老鼠吃掉，则得分为 reward1[i] 。
     * 如果第二只老鼠吃掉，则得分为 reward2[i] 。
     * 给你一个正整数数组 reward1 ，一个正整数数组 reward2 ，和一个非负整数 k 。
     * 请你返回第一只老鼠恰好吃掉 k 块奶酪的情况下，最大 得分为多少。
     *
     * 输入：reward1 = [1,1,3,4], reward2 = [4,4,1,1], k = 2
     * 输出：15
     * 解释：这个例子中，第一只老鼠吃掉第 2 和 3 块奶酪（下标从 0 开始），第二只老鼠吃掉第 0 和 1 块奶酪。
     * 总得分为 4 + 4 + 3 + 4 = 15 。
     * 15 是最高得分。
     * @param reward1
     * @param reward2
     * @param k
     * @return
     */
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int len = reward1.length;
        //diff[i]第i快被第一只老鼠吃了后，sum变化的值
        int[] diff = new int[len];

        //假设所有的都是第二支老鼠吃了
        int sum = 0;
        for (int i = 0; i < reward2.length; i++) {
            sum += reward2[i];
            diff[i] = reward1[i] - reward2[i];
        }
        //最后答案为sum + 变化值（即第一只老鼠吃的k块的值）
        //这给变化中越大总和越大
        Arrays.sort(diff);
        for (int i = len - 1; i >= len - k  ; i--) {
            sum += diff[i];
        }
        return sum;
    }
}
