# leetcode 412 problem
# Fizz Buzz

class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        return ['Fizz'[x%3*4::] + 'Buzz'[x%5*4::] or str(x) for x in xrange(1, n+1)]

class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        return ['Fizz' * (not i % 3) + 'Buzz' * (not i % 5) or str(i) for i in xrange(1, n+1)]
        
        