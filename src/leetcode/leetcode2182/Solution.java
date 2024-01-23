package leetcode.leetcode2182;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/13 18:30
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {
        repeatLimitedString("cczazcc",3);
    }

    public static String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder ans = new StringBuilder();
        int[] chars = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            chars[s.charAt(i) - 'a']++;
        }
        int index = 25;
        while (index >= 0){
            if (chars[index] == 0){
                index--;
                continue;
            }
            String temp = ((char) (index + 'a') + "");
            if (chars[index] <= repeatLimit){
                ans.append(temp.repeat(chars[index]));
                chars[index] = 0;

            }else {
                ans.append(temp.repeat(repeatLimit));
                chars[index] -= repeatLimit;
                int nextIndex = f(index,chars);
                if (nextIndex < 0){
                    break;
                }
                ans.append((char) (nextIndex + 'a'));
                chars[nextIndex]--;
            }
        }
        return ans.toString();
    }

    public static int f(int index , int[] chars){
        for (int i = index - 1; i >= 0; i--) {
            if (chars[i] > 0){
                return i;
            }
        }
        return -1;
    }
}
