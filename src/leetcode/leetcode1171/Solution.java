package leetcode.leetcode1171;

import leetcode.common.ListNode;

/**
 * @author 刘燚
 * @version v1.0.0
 * @Description TODO
 * @createDate：2023/6/11 20:28
 * @email liuyia2022@163.com
 */
public class Solution {
    public static void main(String[] args) {
            ListNode root = new ListNode(1);
            root.next = new ListNode(2);
            root.next.next = new ListNode(3);
            root.next.next.next = new ListNode(-3);
            root.next.next.next.next = new ListNode(4);
            removeZeroSumSublists(root);

    }
    public static ListNode removeZeroSumSublists(ListNode head) {

        //搜索
        ListNode pre = new ListNode();
        //返回的列表的头
        ListNode ans = pre;
        pre.next = head;

        ListNode tmp = head;

        while (true){
            //作为一轮完整遍历的标志
            boolean flag = false;
            //求和
            int sum = 0;
            while (tmp != null){
                sum += tmp.val;
                if (sum == 0){
                    pre.next = tmp.next;
                    tmp = pre.next;
                    flag = true;
                    sum = 0;
                    break;
                }
                tmp = tmp.next;
            }
            if(pre.next == null){
                break;
            }
            //这一轮有和为0在第二层就跳过了，否者须在此处进行下一轮
            if (!flag){
                pre = pre.next;
                tmp = pre.next;
            }
        }
        return ans.next;
    }
}
