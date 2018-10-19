# leetcode 395 problem
# 找出字符串中每个字符都至少重复k次的最长子串

# Brief Recursive Solution.
class Solution(object):
    def longestSubstring(self, s, k):
        for c in set(s):
            if s.count(c) < k:
                return max(self.longestSubstring(t, k) for t in s.split(c))
        return len(s)