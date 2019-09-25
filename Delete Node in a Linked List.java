// leetcode 237 problem
// 在链表中删除某个结点

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// 由于找不到前一个结点，只能将后一个结点的值赋给待删除结点，删除后一个结点
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
