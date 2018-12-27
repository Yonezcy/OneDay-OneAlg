// leetcode 21 problem
// 按升序合并两个链表

// General soluton.
class Solution {  
public:  
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {  
        if(l1 == NULL) return l2;
        if(l2 == NULL) return l1;
        
        ListNode head(-1);
        ListNode *tmp = &head;
        while (l1 && l2) {  
            if (l1->val < l2->val) {  
                tmp->next = l1;
                l1 = l1->next; 
            } else {  
                tmp->next = l2;
                l2 = l2->next; 
            }  
            tmp = tmp->next;
        }  
        if (l1) tmp->next = l1;
        if (l2) tmp->next = l2;
        return head.next;
    }  
}; 

// Recursive Solution.
class Solution {
public:
    ListNode *mergeTwoLists(ListNode *l1, ListNode *l2) {
        if(l1 == NULL) return l2;
        if(l2 == NULL) return l1;
        
        if(l1->val < l2->val) {
            l1->next = mergeTwoLists(l1->next, l2);
            return l1;
        } else {
            l2->next = mergeTwoLists(l2->next, l1);
            return l2;
        }
    }
};