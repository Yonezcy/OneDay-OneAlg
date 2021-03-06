// leetcode 148 problem
// 将单链表进行排序

// Merge sort，O(nlogn) time，constant space.
public class Solution {
  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) return head;

    // step 1. cut the list into two halves.
    ListNode slow = head, fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    
    // step 2. sort each half.
    ListNode l2 = sortList(slow->next);
    slow.next = null;
    ListNode l1 = sortList(head);
    
    // step 3. merge l1 and l2.
    return merge(l1, l2);
  }
  
  ListNode merge(ListNode l1, ListNode l2) {
    ListNode l = new ListNode(0), p = l;
    
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        p.next = l1;
        l1 = l1.next;
      } else {
        p.next = l2;
        l2 = l2.next;
      }
      p = p.next;
    }
    
    if (l1 != null) p.next = l1;
    if (l2 != null) p.next = l2;
    return l.next;
  }
}