package leetcode.leetcode2808;

import java.util.*;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/30 19:27
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(minimumSeconds2(List.of(1,2,1,2)));
    }
    public static int minimumSeconds2(List<Integer> nums){
        Map<Integer,List<Integer>> map = new HashMap<>();
        int n = nums.size();
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums.get(i),k->new ArrayList<>()).add(i);
        }
        for (List<Integer> value : map.values()) {
            if (value.size() == 1){
                max = Math.min(max,n / 2);
                continue;
            }
            int direct = 0;
            for (int i = 0; i < value.size(); i++) {
                int t = value.get((i + 1) % value.size()) - value.get(i);
                direct = Math.max( t > 0 ? t : n + t , direct);
            }
            max = Math.min(max,direct / 2);
        }
        return max;
    }
    /**
     * 暴力解法 时间超时
     * @param nums
     * @return
     */
    public static int minimumSeconds1(List<Integer> nums) {
        Set<Integer> set = new HashSet<>(nums);
        int len = nums.size();
        int max = Integer.MAX_VALUE;
        List<Integer> indexs = new ArrayList<>();
        for (Integer tar : set) {
            Integer[] temp = nums.toArray(new Integer[0]);
            int count = 0;
            while (!check(temp,tar)){
                for (int i = 0; i < temp.length; i++) {
                    if (temp[i].equals(tar) || temp[(i + 1) % len].equals(tar) || temp[(i - 1 + len) % len].equals(tar)){
                        indexs.add(i);
                    }
                }
                for (Integer index : indexs) {
                    temp[index] = tar;
                }
                indexs.clear();
                count++;
            }
            max = Math.min(max,count);
        }
        return max;
    }

    public static boolean check(Integer[] nums,int tar){
        for (Integer num : nums) {
            if (tar != num){
                return false;
            }
        }
        return true;
    }

}
