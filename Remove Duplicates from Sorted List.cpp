// leetcode 82th problem
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if (head == NULL) return head;
        ListNode* start = (ListNode*)malloc(sizeof(ListNode));
        start = head;
        while (start->next) {
            if (start->next->val != start->val)
                start = start->next;
            else start->next = start->next->next; 
        }
        return head;
    }
};