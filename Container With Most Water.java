// leetcode 11 problem
// Container With Most Water

class Solution {
    // brute force
    public int maxArea(int[] height) {
        int i, j;
        int maxVolume = 0;
        for (i = 0; i < height.length-1; i++) {
            for (j = i+1; j < height.length; j++) {
                if (height[i] >= height[j]) {
                    maxVolume = Math.max(height[j] * (j-i), maxVolume);
                }
                else {
                    maxVolume = Math.max(height[i] * (j-i), maxVolume);
                }
            }
        }
        return maxVolume;
    }
    // two pointer approach
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0; r = height.length - 1;
        while (l < r) {
            maxarea =  Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}