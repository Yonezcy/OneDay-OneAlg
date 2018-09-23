// leetcode 242 problem
// 判断两个字符串是否是anagram（相同字母异序词）

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) 
            alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) 
            alphabet[t.charAt(i) - 'a']--;
        for (int i: alphabet) 
            if (i != 0) return false;
        return true;
    }
}