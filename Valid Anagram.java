// leetcode 242 problem
// 判断一个由字母组成的字符串是否是由另一个字符串任意打乱顺序得到的

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) 
            alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) 
            alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) 
            if (i != 0) return false;
        return true;
    }
}