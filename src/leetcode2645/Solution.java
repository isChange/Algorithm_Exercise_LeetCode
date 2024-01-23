package leetcode2645;

import java.util.Stack;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/11 20:37
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {

    }
    public int addMinimum(String word) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        int len = word.length();
        int i = 0;
        while(i < len || stack.peek() != 'c'){
            if (i >= len && stack.peek() != 'c'){
                count++;
                stack.push((char)(stack.peek() + 1));
                continue;
            }
            if(!stack.empty() && stack.peek() == 'c'){
                stack.clear();
            }
            if(stack.empty() && word.charAt(i) != 'a'){
                count++;
                stack.push('a');
                continue;
            }
            if(!stack.empty() && word.charAt(i) - stack.peek() != 1){
                count++;
                stack.push((char)(stack.peek() + 1));
                continue;
            }
            stack.push(word.charAt(i));
            i++;
        }
        return count;
    }
}
