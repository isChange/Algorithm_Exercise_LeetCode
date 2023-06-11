package leetcode.common;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/6/11 20:31
 * @email liuyia2022@163.com
 */
public class ListNode {
    public  int val;
    public ListNode next;
    public ListNode() {
    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
