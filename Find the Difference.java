// leetcode 389 problem
// 找出两个字符数组中不一样的唯一字符

// 异或实现
class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for (int i = 0; i < s.length(); ++i) 
            c ^= s.charAt(i);
        for (int i = 0; i < t.length(); ++i) 
            c ^= t.charAt(i);
        return c;
    }
}

// 建立一个int[26]的数组实现