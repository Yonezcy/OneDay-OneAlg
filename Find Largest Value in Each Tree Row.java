// leetcode 515 problem
// 找出二叉树中每行最大结点值

class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        helper(root, res, 0);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res, int d){
        if (root == null)
            return;
        // Expand list size.
        if (d == res.size()) {
            res.add(root.val);
        }
        else {
        // Or set value.
            res.set(d, Math.max(res.get(d), root.val));
        }
        helper(root.left, res, d+1);
        helper(root.right, res, d+1);
    }
}