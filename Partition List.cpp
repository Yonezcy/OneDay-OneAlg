// leetcode 86 problem
// 将链表中小于target的结点移到前面，并保持这些结点原来的顺序

class Solution {
public:
    ListNode* partition(ListNode* head, int x) {
        ListNode left(0), right(0);
        ListNode *l = &left, *r = &right;

        while (head) {
            ListNode* & ref = head->val < x ? l : r;
            ref->next = head;
            ref = ref->next;
            head = head->next;
        }
        l->next = right.next;
        r->next = NULL;
        return left.next;
    }
};

 // Two pointer solution(accepted)
class Solution {
public:
    ListNode* partition(ListNode* head, int x) {
        if (head == NULL || head->next == NULL) return head;
        
        ListNode* fakehead = (ListNode*)malloc(sizeof(ListNode));
        fakehead->next = head;
        // ptr1指向插入位置之前小于x的最后一个结点
        ListNode* ptr1 = fakehead;
        // ptr2指向插入位置之后小于x的第一个结点的前一个结点
        ListNode* ptr2 = fakehead;
        ListNode* nextstart = (ListNode*)malloc(sizeof(ListNode));
        
        while (ptr1 == ptr2 && ptr2->next) {
            if (ptr2->next->val < x) {
                ptr1 = ptr1->next;
                ptr2 = ptr2->next;
            }
            else ptr2 = ptr2->next;
        }
        
        while (ptr2->next) {
            if (ptr2->next->val < x) {
                nextstart = ptr2->next;
                ptr2->next = ptr2->next->next;
                nextstart->next = ptr1->next;
                ptr1->next = nextstart;
                ptr1 = ptr1->next;
            }
            else ptr2 = ptr2->next;
        }
        return fakehead->next;
    }
};