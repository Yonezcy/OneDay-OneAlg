// leetcode 114th problem
// 将二叉树变为链表（递归实现）

class Solution {
public:
    void flatten(TreeNode *root) {
        flatten(root, NULL);
    }
private:
    TreeNode *flatten(TreeNode *root, TreeNode *tail) {
        if (NULL == root) return tail;
        root->right = flatten(root->left, flatten(root->right, tail));
        root->left = NULL;
        return root;
    }	
};
