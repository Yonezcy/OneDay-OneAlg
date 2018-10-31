// leetcode 459 problem
// 判断一个字符串是否是由某个子串重复得到

class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int l = str.length();
        for (int i = l/2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                String subS = str.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++)
                    sb.append(subS);
                if (sb.toString().equals(str)) 
                    return true;
            }
        }
        return false;
    }
}