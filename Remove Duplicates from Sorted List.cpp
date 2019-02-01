// leetcode 83th problem
// 删除链表中的重复元素

class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if (head == NULL) return head;
        ListNode* start = head;
        while (start->next) {
            if (start->next->val == start->val)
                start->next = start->next->next;
            else start = start->next; 
        }
        return head;
    }
};