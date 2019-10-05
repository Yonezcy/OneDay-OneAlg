// leetcode 23 problem
// merge k sorted list

class Solution {
public:
    ListNode* mergeList(vector<ListNode*>& list) {
        if (list.size() == 0) return NULL;
        auto cmp = [](ListNode* a, ListNode* b) {
            return a->val > b->val;
        };
        priority_queue<ListNode*, vector<ListNode*>, decltype(cmp) > queue(cmp);
        ListNode* res = new ListNode(-1);
        ListNode* cur = res;
        
        for (auto node: list) {
            if (node) {
                queue.push(node);
            }
        }
        while (!queue.empty()) {
            auto tmp = q.top();   
            q.pop();
            cur->next = tmp;
            cur = cur->next;
            if (tmp->next) {
                queue.push(tmp->next);
            }
        }
        return res->next;
    }
};