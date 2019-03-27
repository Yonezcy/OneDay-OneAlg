// leetcode 673 problem
// 求最长递增子序列的个数

class Solution {
    public int findNumberOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        int[] count = new int[nums.length];
        int max_len = 0;
        int res = 0;

        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            count[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    }
                    else if (dp[i] == dp[j] + 1) {
                        count[i] += count[j];
                    }
                }
            }
            if (max_len == dp[i]) res += count[i];
            else if (max_len < dp[i]) {
                max_len = dp[i];
                res = count[i];
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            s = sc.nextLine();
        }
        String[] str = s.split(" ");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        Solution solution = new Solution();
        System.out.println(solution.findNumberOfLIS(nums));
    }
}
