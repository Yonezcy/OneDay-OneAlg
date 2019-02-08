// leetcode 141 problem
// 判断一个链表中是否有环

// Runner and walker solution.
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        // 设置两个指针，runner每次移动两步，walker一步，如果有循环总会有相遇的时候
        ListNode walker = head;
        ListNode runner = head;
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) return true;
        }
        return false;
    }
}

// Destroy the bridge after crossed the river. Think the case [1,2,3,4,5,6,3].
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p = head, pre = head;
        while (p != null && p.next != null) {
            if (p.next == head) return true;
            p = p.next;
            pre.next = head;
            pre = p;
        }
        return false;
    }
}