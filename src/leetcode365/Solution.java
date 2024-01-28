package leetcode365;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2024/1/28 17:54
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {

    }

    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if (jug1Capacity + jug2Capacity < targetCapacity){
            return false;
        }
        return targetCapacity % gcd(jug1Capacity,jug2Capacity) == 0;
    }

    public int gcd(int x , int y){
        while (x % y != 0){
            int t = x % y;
            x = y;
            y = t;
        }
        return y;
    }
}
