// leetcode 237 problem
// 在单链表中删除指定的结点node

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

 // 删除node很难，因为不能捕捉到node的上一个结点，但是可以删除node下一个结点，只用把node下一个结点的值赋给node即可
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}