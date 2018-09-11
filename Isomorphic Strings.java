// leetcode 205 problem
// 判断两个字符串是否为同型字符串（例如paper和title） 

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m1[] = new int[256];
        int m2[] = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // m1和m2中存的是字符在原字符串中的位置，比较对应字符的位置，判断在前赋值在后
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}