class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return n; 
        
        int count[] = new int[n+1];
        count[0] = 0; count[1] = 1; count[2] = 2;
        // 从3开始，因为2是特例，count[2] != count[0] + count[1]
        for (int i=3; i<n+1; i++) {
            count[i] = count[i-1] + count[i-2];
        }
        return count[n];
    }
}