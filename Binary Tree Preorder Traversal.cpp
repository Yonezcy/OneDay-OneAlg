// Leetcode 144 problem
// 二叉树前序遍历（迭代解法）

class Solution {
public:
    vector<int> preorderTraversal(TreeNode *root) {
       vector<int> res;
       if (!root)
           return res;
       stack<TreeNode *> st;
       st.push(root);
       while (st.size()) {
           TreeNode *temp = st.top();
           st.pop();
           res.push_back(temp->val);
           if (temp->right)
               st.push(temp->right);
           if (temp->left)
               st.push(temp->left);
       }
       return res;
   }
};