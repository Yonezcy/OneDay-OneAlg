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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2)
    {
        if (!l1) return l2;
        if (!l2) return l1;
        int x = 0;
        ListNode* node = (ListNode*) malloc (sizeof(ListNode));
        ListNode* head = node;
        while(l1 || l2 || x )    
        {
            node->val = 0;
            if (l1 != NULL) node->val += l1->val;
            if (l2 != NULL) node->val += l2->val;
            if (x != 0) node->val += x;
            if (node->val > 9)
            {
                node->val -= 10;  
                x = 1 ;           
            }
            else x = 0;

            if (l1 != NULL)
                l1 = l1->next; 

            if (l2 != NULL)
                l2 = l2->next; 

            if (l1 || l2 || x)
            {
                node->next = (ListNode*) malloc (sizeof(ListNode));
                node = node->next;             
            }   
        }  
        node->next = NULL;   
        return head;
    }
};

// Time exceed function
/*
Not using extra space
*/
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2)
    {
        if (!l1) return l2;
        if (!l2) return l1;
        int len1 = 0, len2 = 0;
        ListNode* newL1;
        ListNode* newL2;
        newL1 = l1; newL2 = l2;
        
        while (l1) {
            len1++;
            l1 = l1->next;
        }
        while (l2) {
            len2++;
            l2 = l2->next;
        }
        
        ListNode* head;
        int x = 0;
        if (len1 > len2)
            head = newL1;
        else head = newL2;
        
        while (newL1 || newL2 || x) {
            if (len1 > len2 && newL2) {
                newL1->val = newL1->val + newL2->val + x;
                if (newL1->val >= 10) {
                    newL1->val -= 10;
                    x = 1;
                }
                else x = 0;
            }
            if (len2 >= len1 && newL1) {
                newL2->val = newL2->val + newL1->val + x;
                if (newL2->val >= 10) {
                    newL2->val -= 10;
                    x = 1;
                }
                else x = 0;
            }
            if (newL1) newL1 = newL1->next;
            if (newL2) newL2 = newL2->next;
        }
        
        return head;
    }
};