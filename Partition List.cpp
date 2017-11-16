/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
 // Accepted solution
 class Solution {
public:
    ListNode* partition(ListNode* head, int x) {
        ListNode left(0), right(0);
        ListNode *l = &left, *r = &right;

        while(head){
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
        ListNode* ptr1 = fakehead;
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