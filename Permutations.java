// leetcode 46 problem
// 求全排列（给定的数组中无重复）

// 回溯法（java实现，类比subset、combination sum记忆）
class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       // Arrays.sort(nums); // not necessary
       backtrack(list, new ArrayList<>(), nums);
       return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums) {
       if (tempList.size() == nums.length) {
          list.add(new ArrayList<>(tempList));
       } else {
          for (int i = 0; i < nums.length; i++) { 
             if (tempList.contains(nums[i])) continue; // element already exists, skip
             tempList.add(nums[i]);
             backtrack(list, tempList, nums);
             tempList.remove(tempList.size()-1);
          }
       }
    }
}