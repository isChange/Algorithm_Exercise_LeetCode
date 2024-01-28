package leetcode.leetcode670;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/22 20:08
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(maximumSwap(19931227));
    }
    public static int maximumSwap(int num) {
        char[] chars = Integer.valueOf(num).toString().toCharArray();
        int lastIndex = chars.length - 1;
        int a = -1;
        int b = -1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] < chars[lastIndex]){
                a = i;
                b = lastIndex;
            }else if (chars[i] > chars[lastIndex]){
                lastIndex = i;
            }
        }
        if (a == -1){
            return num;
        }
        char t = chars[a];
        chars[a] = chars[b];
        chars[b] = t;
        return Integer.parseInt(new String(chars));
    }
}
