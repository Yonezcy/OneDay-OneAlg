// leetcode 382 problem
// 从单链表中随机取出一个结点的值

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private ListNode head;
    private Random random;
    
    public Solution(ListNode h) {
        head = h;       
        random = new Random();        
    }
    
    public int getRandom() {
        ListNode c = head;
        int r = c.val;
        for (int i = 1; c.next != null; i++) {
            c = c.next;
            if (random.nextInt(i+1) == i) r = c.val;                        
        }
        return r;
    }
}