// leetcode 94 problem
// 二叉树的中序遍历序列（迭代解法）

class Solution {
public:
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> res;
        if (root == NULL) return res;
        stack<TreeNode*> s;
        TreeNode* node = root;
        while (s.size() || node) {
            while (node) {
                s.push(node);
                node = node->left;
            }
            node = s.top();
            s.pop();
            res.push_back(node->val);
            node = node->right;
        }
        return res;
    }
};