// leetcode 160 problem
// 找出两个链表的公共部分

class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (headA == NULL || headB == NULL) return NULL;
        int len1 = 0, len2 = 0;
        ListNode* l1 = headA;
        ListNode* l2 = headB;
        while (l1 && ++len1) { l1 = l1->next; }
        while (l2 && ++len2) { l2 = l2->next; }
        
        if (len1 > len2) return getIntersectionNode(headB, headA);
        
        int dif = len2 - len1;
        while (dif--) { headB = headB->next; }
        while (headA && headB) {
            if (headA == headB) return headA;
            headA = headA->next;
            headB = headB->next;
        }
        return NULL;
    }
};