// leetcode 83th problem
// 删除单链表中的所有重复元素（含元素本身）

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