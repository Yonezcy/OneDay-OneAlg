class Solution {
    public int strStr(String haystack, String needle) {
        // needle == ""
        if (needle.equals("")) return 0;
        // haystack == "" && needle != ""
        if (haystack.equals("") && !needle.equals("")) return -1;
        int len1 = haystack.length();
        int len2 = needle.length();
        int i, j;
        for (i=0; i<len1; i++) {
            if ((i+len2) > len1) break;
            if (haystack.substring(i, i+len2).equals(needle)) return i;
        }
        return -1;
    }
}