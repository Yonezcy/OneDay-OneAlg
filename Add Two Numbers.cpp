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
    struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2)
    {
        int x = 0;

        struct ListNode* node = (struct ListNode*) malloc (sizeof(struct ListNode));

        struct ListNode* head = node;

        while(l1!=NULL || l2!=NULL || x!=0)    
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
                node->next = (struct ListNode*) malloc (sizeof(struct ListNode));
                node = node->next;             
            }   

        }  
        node->next = NULL;  

        return head;
    }
};