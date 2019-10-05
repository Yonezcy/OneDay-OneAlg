// leetcode 102 problem
// 层序遍历二叉树

// 输出为list嵌套
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        levelHelper(res, root, 0);
        return res;
    }
    
    public void levelHelper(List<List<Integer>> res, TreeNode root, int height) {
        if (root == null) return;
        if (height >= res.size()) res.add(new LinkedList<Integer>());
        res.get(height).add(root.val);
        levelHelper(res, root.left, height+1);
        levelHelper(res, root.right, height+1);
    }
}

// 输出为1个list
class Solution {
    public List<Integer> levelOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new Queue<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode t = queue.top();
            queue.pop();
            res.add(t.val);
            if (t.left)
                queue.offer(t.left);
            if (t.right)
                queue.offer(t.right);
        }
        return res;
    }
}