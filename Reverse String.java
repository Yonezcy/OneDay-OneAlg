// leetcode 344 problem
// reverse string

// solution 1: using extra space
class Solution {
    public String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
}

// solution 2: recursive
class Solution {
    public String reverseString(String s) {
        int length = s.length();
        if (length <= 1) return s;
        String leftStr = s.substring(0, length/2);
        String rightStr = s.substring(length/2, length);
        return reverseString(rightStr) + reverseString(leftStr);
    }
}