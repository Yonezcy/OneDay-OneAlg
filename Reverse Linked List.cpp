// leetcode 206 problem
// Reverse LinkList.

// Iterative Solution.
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if (head == NULL) return head;
        ListNode* pre = NULL;
        ListNode* cur = head;
        while (cur) {
            ListNode* p = cur->next;
            cur->next = pre;
            pre = cur;
            cur = p;
        }
        return pre;
    }
};
// Recursive Solution.
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if (head == NULL || head->next == NULL) return head;
        ListNode* p = reverseList(head->next);
        head->next->next = head;
        head->next = NULL;
        return p;
    }
};