// leetcode 647 problem
// 找出字符数组中回文子串的个数

public class Solution {
    int count = 0;
    
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        for (int i = 0; i < s.length(); i++) { 
            extendPalindrome(s, i, i); 
            extendPalindrome(s, i, i+1); 
        }
        return count;
    }
    
    private void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++; left--; right++;
        }
    }
}