// leetcode 222 problem
// 计算完全二叉树的结点数(只有最后一层可以不满)

class Solution {
public:
    int countNodes(TreeNode* root) {
        if (!root) return 0;
        int hl = 0, hr = 0;
        TreeNode *l = root, *r = root;
        while (l) {hl++; l = l->left;}
        while (r) {hr++; r = r->right;}
        if (hl == hr) return pow(2, hl) - 1;
        return 1 + countNodes(root->left) + countNodes(root->right);
    }
};