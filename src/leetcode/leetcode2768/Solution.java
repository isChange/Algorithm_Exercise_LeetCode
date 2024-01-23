package leetcode.leetcode2768;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/23 19:37
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {
            alternatingSubarray(new int[]{2,3,4,3,4});
    }
    public static int alternatingSubarray(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return -1;
        }
        int max = 0;
        int left = 0;
        int right = left + 1;
        while (right < len){
            if(check(nums,left,right)){
                max = Math.max(max,left - right + 1);
                right++;
            }else {
                left = right - 1;
                right = left + 1;
            }
        }
        return max;
    }

    public static boolean check(int[] arr,int start , int end){
        int index = 0;
        for (int i = start; i < end; i++) {
            if (arr[i + 1] - arr[i] != (int)Math.pow(-1,index)){
                return false;
            }
            index++;
        }
        return true;
    }
}
