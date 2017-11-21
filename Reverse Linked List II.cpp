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
    ListNode *reverseBetween(ListNode *head, int m, int n) {
        if (m == n) return head;
        n -= m; 
        ListNode* prehead = (ListNode*)malloc(sizeof(ListNode));
        prehead->next = head;
        ListNode* pre = prehead;
        while (--m) pre = pre->next;        
        ListNode* pstart = pre->next;
        while (n--)
        {
            ListNode *p = pstart->next;
            pstart->next = p->next;
            p->next = pre->next;
            pre->next = p;
        }
        return prehead->next;
    }
};