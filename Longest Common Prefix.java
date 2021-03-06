// leetcode 14 problem
// 找出字符数组中字符串的最长公共前缀

// Brute force solution.
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i;
        int maxLength = 0;
        if (strs.length < 2) return " ";
        
        String s3 = strs[1].substring(0, findLengthOfTwoString(strs[0], strs[1]));
        for (i = 2; i < strs.length; i++) {
            maxLength = Math.max(maxLength, findLengthOfTwoString(s3, strs[i]));
            s3 = strs[i].substring(0, maxLength);
        }
        return strs[0].substring(0, maxLength);
    }
    public int findLengthOfTwoString(String s1, String s2){
        int maxLength = 0;
        int i;
        int len = Math.min(s1.length(), s2.length());
        for (i = 0; i < len; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                maxLength++;
            }
            else break;
        }
        return maxLength;
    }
}

// Horizontal scanning.
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String substr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < substr.length()) {
                substr = substr.substring(0, strs[i].length());
            }
            while (!strs[i].substring(0, substr.length()).equals(substr)) {
                substr = substr.substring(0, substr.length()-1);
                if (substr.length() == 0) return "";
            }
        }
        return substr;
    }
}

// Horizontal scanning(indexOf trick).
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // Function indexOf() return the first index of prefix in strs[i].
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}

// Vertical scanning.
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].charAt(j);
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() == j || strs[i].charAt(j) != c) {
                    return strs[i].substring(0, j);
                }
            }
        }
        return strs[0];
    }
}