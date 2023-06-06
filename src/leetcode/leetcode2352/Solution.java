package leetcode.leetcode2352;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/6/6 20:22
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {
            equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}});
    }

    /**
     * 2352. 相等行列对
     * 给你一个下标从 0 开始、大小为 n x n 的整数矩阵 grid ，返回满足 Ri 行和 Cj 列相等的行列对 (Ri, Cj) 的数目。
     * 如果行和列以相同的顺序包含相同的元素（即相等的数组），则认为二者是相等的。
     *
     * 输入：grid = [[3,2,1],[1,7,6],[2,7,7]]
     * 输出：1
     * 解释：存在一对相等行列对：
     * - (第 2 行，第 1 列)：[2,7,7]
     * @param grid
     * @return
     */
    public static int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;;
        int[][] copy = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ;j++) {
                copy[i][j] = grid[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Arrays.equals(copy[i],grid[j])){
                    count++;
                }
            }
        }
        return count;
    }


}
