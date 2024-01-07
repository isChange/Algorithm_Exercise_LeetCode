package leetcode.leetcode2397;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/4 19:53
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {
        maximumRows(new int[][]{{1},{0}},1);
    }
    public static int maximumRows(int[][] matrix, int numSelect) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] mask = new int[m];
        //将每一行的数据用十进制数表示
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mask[i] += matrix[i][j] << (n - j - 1);
            }
        }
        //枚举选举的列S
        //
        int max  = 0 ;
        // 代表n列中所有列的可能
        int total = 1 << n;
        //当前S的可能 1 为 0...1 \ 2 为 0 ... 1 1
        int concurrent = 1;
        while (concurrent < total){
            // 当前S 1 的个数是否符合条件
            if (Integer.bitCount(concurrent) == numSelect){
                int temp = 0;
                /**
                 * 计算当前S 覆盖行数
                 * 覆盖 例如   0 1 0 1 1   row
                 *        &  1 1 1 1 1    S
                 *        --------------
                 *           0 1 0 1 1   覆盖了
                 */
                for (int i = 0; i < m; i++) {
                    if ((mask[i] & concurrent) == mask[i]){
                        temp++;
                    }
                }
                max = Math.max(temp,max);
            }
            concurrent++;
        }
        return max;
    }
}
