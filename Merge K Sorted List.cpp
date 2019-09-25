// leetcode 23 problem
// merge k sorted list

class Solution {
public:
    ListNode* mergeList(vector<ListNode*>& list) {
        if (list.size() == 0) return null;
        auto cmp = [](ListNode*& a, ListNode*& b) {
            return a->val > b->val;
        };
        priority_queue<ListNode*, vector<ListNode*>, decltype(cmp)> queue(cmp);
        ListNode* res = new ListNode(-1);
        ListNode* cur = res;
        
        for (auto node: list) {
            queue.push(node);
        }
        while (!queue.empty()) {
            auto q = q.top();
            q.pop();
            cur->next = t;
            cur = cur->next;
            if (cur->next) {
                queue.push(cur->next);
            }
        }
        return res->next;
    }
};