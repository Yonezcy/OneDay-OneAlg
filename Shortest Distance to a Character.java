// leetcode 821 problem
// 找出字符串中所有字符到指定字符的最小距离

public int[] shortestToChar(String S, char C) {
    int n = S.length();
    int[] res = new int[n];
    int pos = -n;
    for (int i = 0; i < n; i++) {
        if (S.charAt(i) == C) pos = i;
        res[i] = i - pos;
    }
    for (int i = n-1; i >= 0; i--) {
        if (S.charAt(i) == C)  pos = i;
        res[i] = Math.min(res[i], Math.abs(i-pos));
    }
    return res;
}