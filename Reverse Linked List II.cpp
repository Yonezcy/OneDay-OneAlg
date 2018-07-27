// leetcode 92 problem
// 将单链表指定位置区间里的结点反转

class Solution {
public:
    ListNode *reverseBetween(ListNode *head, int m, int n) {
        if (m == n) return head;
        n -= m;
        ListNode* fakehead = (ListNode*)malloc(sizeof(ListNode));
        fakehead->next = head;
        ListNode* pre = fakehead;
        while (--m) pre = pre->next;
        ListNode* pstart = pre->next;
        while (n--) {
            ListNode* p = pstart->next;
            pstart->next = p->next;
            p->next = pre->next;
            pre->next = p;
        }
        return fakehead->next;
    }
};