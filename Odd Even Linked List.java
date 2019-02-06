// leetcode 328 problem
// 将链表中的奇数索引结点移到偶数号索引结点的前面

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        ListNode odd = head, even = head.next, evenHead = even; 
        while (even != null && even.next != null) {
            odd.next = odd.next.next; 
            even.next = even.next.next; 
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}