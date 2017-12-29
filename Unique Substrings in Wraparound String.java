// leetcode 467 problem
// 寻找字符串中按字母表顺序的子串的个数

public class Solution {
    public int findSubstringInWraproundString(String p) {
        // count[i] is the maximum unique substring end with ith letter.
        int[] count = new int[26];
        int maxLengthCur = 0; 

        for (int i = 0; i < p.length(); i++) {
            if (i > 0 && (p.charAt(i) - p.charAt(i-1) == 1 || (p.charAt(i-1) - p.charAt(i) == 25))) 
                maxLengthCur++;
            else
                maxLengthCur = 1;
            int index = p.charAt(i) - 'a';
            count[index] = Math.max(count[index], maxLengthCur);
        }

        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum += count[i];
        }
        return sum;
    }
}