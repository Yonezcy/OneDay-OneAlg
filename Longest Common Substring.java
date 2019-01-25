// Longest Common Substring

class Solution {
	public int longestCommonSubstr(String s, String t) {
		if (s.length() == 0 || t.length() == 0) return 0;
		int[][] dp = new int[s.length()][t.length()];
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			dp[i][0] = 0;
		}
		for (int j = 0; j < t.length(); j++) {
			dp[0][j] = 0;
		}
		for (int i = 1; i < s.length()+1; i++) {
			for (int j = 1; j < t.length()+1; j++) {
				if (s.charAt(i-1) == t.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
					maxLength = Math.max(maxLength, dp[i][j]);
				}
				else dp[i][j] = 0;
			}
		}
		return maxLength;
	}
}