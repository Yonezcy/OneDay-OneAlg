// leetcode 19 problem
// 删除链表从后往前的第n个结点

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* first = head;
        ListNode* dummy;
        dummy->next = head;
        int length = 0;
        while (first != NULL) {
            length++;
            first = first->next;
        }
        int len = length - n;
        first = dummy;
        while (len > 0) {
            len--;
            first = first->next;
        }
        first->next = first->next->next;
        return dummy->next;
    }
};
