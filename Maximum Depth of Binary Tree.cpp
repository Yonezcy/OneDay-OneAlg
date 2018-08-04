// leetcode 104th problem
// 求二叉树的最大深度

class Solution {
public:
    int maxDepth(TreeNode* root) {
        if (root == nullptr) return 0;
        return max(maxDepth(root->left),  maxDepth(root->right)) + 1;
    }
};