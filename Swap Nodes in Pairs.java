// leetcode 24 problem
// 两两交换链表中的相邻结点

class Solution {
    public ListNode swapPairs(ListNode head) {
      if(head == null || head.next == null)
        return head;
    
      ListNode fakehead = new ListNode(-1);
      fakehead.next = head;
      
      ListNode ptr1 = fakehead;
      ListNode ptr2 = head;
      
      while(ptr2!=null && ptr2.next!=null){
          ListNode nextstart = ptr2.next.next;
          ptr2.next.next = ptr2;
          ptr1.next = ptr2.next;
          ptr2.next = nextstart;
          ptr1 = ptr2;
          ptr2 = ptr2.next;
      }
    return fakehead.next;
  }
}