# leetcode 557 problem
# 将字符串中以' '隔开的子串翻转

class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        return ' '.join(x[::-1] for x in s.split())
        