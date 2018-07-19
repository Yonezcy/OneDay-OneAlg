// leetcode 77 problem
// 给定n和k，返回1-n的所有k个数的排列

// 经典回溯法
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        if (n == 0 || k == 0) return null;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        combination(list, new ArrayList<Integer>(), 1, n, k);
        return list;
    }
    
    public void combination(List<List<Integer>> list, List<Integer> curr, int start, int n, int k) {
        if (k == 0) {
            list.add(new ArrayList<Integer>(curr));
            return;
        }
        for (int i = start; i <= n; i++) {
            curr.add(i);
            combination(list, curr, i+1, n, k-1);
            curr.remove(curr.size()-1);
        }
    }
}