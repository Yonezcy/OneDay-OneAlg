// leetcode 257 problem
// 寻找二叉树所有根到叶子的路径

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if (root == null) return list;
        searchBT(root, "", list);
        return list;
    }
    
    private void searchBT(TreeNode root, String path, List<String> list) {
        if (root.left == null && root.right == null) 
            list.add(path + root.val);
        if (root.left != null) 
            searchBT(root.left, path+root.val+"->", list);
        if (root.right != null) 
            searchBT(root.right, path+root.val+"->", list);
    }
}