// leetcode 160 problem
// 找出两个链表的公共部分（公共部分指中间某个结点至最后一个元素）

// 两个链表的长度可能不同，但是它们公共部分的长度相同，前面的长度不同，
// 我们用第一个循环消除长度差异，第二个循环找出公共部分
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}