// Leetcode 61th problem
// 旋转链表，将链表后k个结点按顺序移到前面

class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {

        if (head == NULL || k == 0) return head;
        ListNode* left = (ListNode*)malloc(sizeof(ListNode));
        ListNode* newLeft = (ListNode*)malloc(sizeof(ListNode));
        
        left = head;
        newLeft = head;
        int length = 0;
        
        while (left->next) {
            length++;
            left = left->next;
        }
        length++;
        left->next = head;

        k = k % length;
        for (int i = 0; i < length-k; i++) {
            left = left->next;
        }
        newLeft = left->next;
        left->next = NULL;
        
        return newLeft;
    }        
};  