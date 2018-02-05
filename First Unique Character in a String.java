// leetcode 387 problem
// 找出字符串中第一个出现一次的字符（有的出现多次）

class Solution {
    public int firstUniqChar(String s) {
        int freq [] = new int[26];

        // 计算每个字母出现的频率
        for(int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;
        
        // 找出第一个出现一次的字符
        for(int i = 0; i < s.length(); i++)
            if(freq[s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}