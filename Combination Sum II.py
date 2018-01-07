# leetcode 40 problem 
# 求数组中和为target的序列（单个序列中不允许重复取数）

# dfs实现
class Solution(object):
    def combinationSum2(self, candidates, target):
        res = []
        candidates.sort()
        self.dfs(candidates, target, 0, [], res)
        return res

    def dfs(self, nums, target, index, path, res):
        if target < 0:
            return  # backtracking
        if target == 0:
            if path not in res:
                res.append(path)
            return 
        if index > len(nums):
            return
        for i in range(index, len(nums)):
            self.dfs(nums, target-nums[i], i+1, path+[nums[i]], res)
        