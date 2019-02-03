// leetcode 142 problem
// 找出链表中循环开始的结点

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if (head == NULL || head->next == NULL) return NULL;
        ListNode *slow  = head;
        ListNode *fast  = head;
        ListNode *entry = head;
        while (fast->next && fast->next->next) {
            slow = slow->next;
            fast = fast->next->next;

            // It can be concluded that the distance between meeting location and cycle begin location is equal
            // to distance between head and cycle begin.
            if (slow == fast) {                      
                while (slow != entry) {              
                    slow  = slow->next;
                    entry = entry->next;
                }
                return entry;
            }
        }
        return NULL;                            
    }
};