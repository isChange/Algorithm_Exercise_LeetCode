package leetcode.leetcode2788;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/20 18:34
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString("$easy$".split("\\$")));
    }
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            String[] split = word.split(separator + "");
            for (String s : split) {
                if (!s.equals("")){
                    ans.add(s);
                }
            }
        }
        return ans;
    }
}
