package leetcode.progamer17_11;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/6/12 20:47
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {

    }
    public int findClosest(String[] words, String word1, String word2) {
        int min =Integer.MAX_VALUE;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)){
                index1 = i;
            }
            if (words[i].equals(word2)){
                index2 = i;
            }
            if(words[index1].equals(word1) && words[index2].equals(word2)){
                min = Math.min(min,Math.abs(index1 - index2));
                if (index1 < index2){
                    index1 = index2;
                }else{
                    index2 = index1;
                }
            }
        }
        return min;
    }
}
