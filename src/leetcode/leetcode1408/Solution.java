package leetcode.leetcode1408;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/6/8 22:19
 * @email liuyia2022@163.com
 */
public class Solution {
    public List<String> stringMatching(String[] words) {

        Arrays.sort(words,(s1,s2)->{
            return s1.length() >= s2.length() ? 1 : -1;
        });

        List<String> ans = new ArrayList();
        for(int i = 0 ; i < words.length ; ++i){
            for(int j = i + 1; j < words.length; ++j){
                if(words[j].contains(words[i])){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}
