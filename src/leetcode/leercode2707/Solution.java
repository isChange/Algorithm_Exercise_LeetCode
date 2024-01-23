package leetcode.leercode2707;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/9 19:52
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {

    }
    public static int minExtraChar(String s, String[] dictionary) {
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(dictionary));
        int len = s.length();
        int[] f = new int[len + 1];
        f[0] = 1;
        for (int i = 0; i <= len; i++) {
            f[i] = f[i - 1] + 1;
            for (int j = 0; j < i; j++) {
                if (set.contains(s.substring(j,i))){
                    f[i] = Math.min(f[i],f[j]);
                }
            }
        }
        return f[len];
    }
}
