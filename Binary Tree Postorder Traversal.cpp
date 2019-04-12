// leetcode 145 problem
// 二叉树后序遍历序列（迭代解法）

// 前序 根 左 右 -> 根 右 左 reverse-> 左 右 根 
class Solution {
public:
    vector<int> postorderTraversal(TreeNode *root) {
       vector<int> res;
       if (!root) return res;
       stack<TreeNode *> st;
       st.push(root);
       while (st.size()) {
           TreeNode *temp = st.top();
           st.pop();
           res.push_back(temp->val);
           if (temp->left)
               st.push(temp->left);
           if (temp->right)
               st.push(temp->right);
       }
       reverse(res.begin(),res.end());
       return res;
   }
};