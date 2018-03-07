// leetcode 383 problem
// 判断一个字符串a是否可以从另一个字符串b里构建（b里有a相同的字符，数量大于等于，位置任意）

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}