package leetcode.leetcode1375;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/6/16 23:08
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {
        numTimesAllBlue(new int[]{4,1,2,3});
    }
    public static int numTimesAllBlue(int[] flips) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < flips.length; i++) {
            sb.append(0);
        }
        int count = 0;
        for (int i = 0; i < flips.length; i++) {
            sb.replace(flips[i] - 1,flips[i],"1");
            if (sb.indexOf("0")  > i || sb.indexOf("0") < 0){
                count++;
            }
        }
        return  count;
    }
}
