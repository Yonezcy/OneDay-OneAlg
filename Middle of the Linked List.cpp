// leetcode 876 problem
// 找出链表中间的结点

class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        if (head == NULL) return head;
        ListNode* start = head;
        int len = 0;
        while (start) {
            start = start->next;
            len++; 
        }
        int halfLength = len / 2;
        while (halfLength > 0) {
            head = head->next;
            halfLength--;
        }
        return head;
    }
};