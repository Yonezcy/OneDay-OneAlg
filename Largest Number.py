# leetcode 179 problem
# 将数组中的数拼接起来，返回最大的数

class Solution:
    # @param num, a list of integers
    # @return a string
    def largestNumber(self, num):
        num = [str(x) for x in num]
        # lambda表达式定义一个简单的数组
        # cmp(y+x, x+y)降序排列 cmp(x+y, y+x)是升序
        # cmp前减后是升序，后减前是降序
        num.sort(cmp = lambda x, y: cmp(y+x, x+y))
        # or '0' 防止输入为'0'的情况
        return ''.join(num).lstrip('0') or '0'