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
    ListNode* swapPairs(ListNode* head) {
        if (head == NULL || head->next == NULL) return head;
        ListNode* fakehead = (ListNode*)malloc(sizeof(ListNode));
        fakehead->next = head;
        ListNode* ptr1 = fakehead;
        ListNode* ptr2 = head;
        ListNode* nextstart;
        
        while (ptr2 != NULL && ptr2->next != NULL) {
            nextstart = ptr2->next->next;
            ptr2->next->next = ptr2;
            ptr1->next = ptr2->next;
            ptr2->next = nextstart;
            ptr1 = ptr2;
            ptr2 = ptr2->next;
        }
        return fakehead->next;
    }
};