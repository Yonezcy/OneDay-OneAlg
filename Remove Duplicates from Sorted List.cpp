// leetcode 82th problem
// 删除链表中的重复元素

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