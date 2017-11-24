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