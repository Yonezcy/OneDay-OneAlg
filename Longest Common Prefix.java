// leetcode 14 problem
// 找出字符数组中字符串的最长公共前缀

class Solution {
    //brute force
    public String longestCommonPrefix(String[] strs) {
        int i;
        int maxLength = 0;
        if (strs.length < 2) return " ";
        
        String s3 = strs[1].substring(0, findLengthOfTwoString(strs[0], strs[1]));
        for (i=2; i<strs.length; i++){
            maxLength = Math.max(maxLength, findLengthOfTwoString(s3, strs[i]));
            s3 = strs[i].substring(0, maxLength);
        }
        return strs[0].substring(0, maxLength);
    }
    public int findLengthOfTwoString(String s1, String s2){
        int maxLength = 0;
        int i;
        int len = Math.min(s1.length(), s2.length());
        for (i=0; i<len; i++){
            if (s1.charAt(i) == s2.charAt(i)){
                maxLength++;
            }
            else break;
        }
        return maxLength;
    }
}

class Solution {
    // horizontal scanning
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i=1; i<strs.length; i++)
            // function indexOf() return the first index of prefix in strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}

class Solution {
    // vertical scanning
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i=0; i<strs[0].length; i++) {
            char c = strs[0].charAt(i);
            for (int j=i; j<strs.length; j++) {
                if (i == strs[j].length || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return 0;
    }
}