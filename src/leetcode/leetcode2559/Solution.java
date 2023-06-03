package leetcode.leetcode2559;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/6/3 21:32
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {

    }

    /**
     * 统计范围内的元音字符串数
     * 给你一个下标从 0 开始的字符串数组 words 以及一个二维整数数组 queries 。
     * 每个查询 queries[i] = [li, ri] 会要求我们统计在 words 中下标在 li 到 ri 范围内（包含 这两个值）并且以元音开头和结尾的字符串的数目。
     * 返回一个整数数组，其中数组的第 i 个元素对应第 i 个查询的答案。
     * 注意：元音字母是 'a'、'e'、'i'、'o' 和 'u' 。
     * 例子
     * 输入: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
     * 输出:[2,3,0]
     * 解释：以元音开头和结尾的字符串是 "aba"、"ece"、"aa" 和 "e" 。
     * 查询 [0,2] 结果为 2（字符串 "aba" 和 "ece"）。
     * 查询 [1,4] 结果为 3（字符串 "ece"、"aa"、"e"）。
     * 查询 [1,1] 结果为 0 。
     * 返回结果 [2,3,0]
     * @param words
     * @param queries
     * @return
     */
    public int[] vowelStrings(String[] words, int[][] queries) {
        //prevSum[i] 为前i个符合条件的总数
        int[] preSum = new int[words.length  +1];
        for(int i = 0; i < words.length ;++i){
            if(check(words[i])){
                preSum[i+1] += preSum[i]  + 1;
            }else{
                preSum[i+1] = preSum[i];
            }
        }
        int[] ans = new int[queries.length];
        for(int i = 0 ; i < queries.length ; ++i){
            int l = queries[i][0];
            int r = queries[i][1];
            //i ~ j 及 前j个总是减去前i个总数
            if(l == 0){
                ans[i] = preSum[r+1];
            }else{
                ans[i] = preSum[r+1] - preSum[l];
            }
        }
        return ans;
    }

    //检查是否符合条件
    public boolean check(String str){
        return f(str.charAt(0)) && f(str.charAt(str.length() - 1));
    }

    public boolean f(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
