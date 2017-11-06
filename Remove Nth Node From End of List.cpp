class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* first = head;
        ListNode* dummy;
        dummy->next = head;
        int length = 0;
        while (first != NULL) {
            length++;
            first = first->next;
        }
        int len = length - n;
        first = dummy;
        while (len > 0) {
            len--;
            first = first->next;
        }
        first->next = first->next->next;
        return dummy->next;
    }
};
