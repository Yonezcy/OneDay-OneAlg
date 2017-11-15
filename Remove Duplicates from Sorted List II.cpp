//leetcode 83th problem
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
        
        ListNode* fakehead = (ListNode*)malloc(sizeof(ListNode));
        ListNode* start = head;
        fakehead->next = head;
        ListNode* preStart = fakehead;
        
        while (start) {
            while (start->next && start->next->val == start->val)
                start = start->next;
            if (preStart->next == start)
                preStart = preStart->next;
            else preStart->next = start->next;
            start = start->next;
        }
        
        return fakehead->next;
    }
};