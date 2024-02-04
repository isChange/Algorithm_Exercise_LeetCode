package leetcode.leetcode2855;

import java.util.List;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/2/4 21:20
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {
        minimumRightShifts(List.of(2,1,4));
    }
    public static int minimumRightShifts(List<Integer> nums) {
        int index = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)){
                index = i + 1;
                break;
            }
        }
        if (index == 0){
            return 0;
        }
        int t = nums.get(0);
        for (int i = nums.size() - 1; i >= index; i--) {
            if(t >= nums.get(i)){
                t = nums.get(i);
            }else {
                return -1;
            }
        }
        return nums.size() - index;
    }

}
