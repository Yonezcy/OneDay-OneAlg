/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
 // iterative solution
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
// recursive solution
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