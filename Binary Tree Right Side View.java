// leetcode 199 problem
// 返回二叉树每一层最右边的结点集合

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }
    
    public void rightView(TreeNode curr, List<Integer> result, int currDepth) {
        if (curr == null) return;
        if (currDepth == result.size()) result.add(curr.val);
        rightView(curr.right, result, currDepth+1);
        rightView(curr.left, result, currDepth+1);
    }
}