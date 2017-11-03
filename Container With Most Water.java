class Solution {
    //brute force
    public int maxArea(int[] height) {
        int i, j;
        int maxVolume = 0;
        for (i=0; i<height.length-1; i++){
            for (j=i+1; j<height.length; j++){
                if (height[i] >= height[j]){
                    maxVolume = Math.max(height[j] * (j-i), maxVolume);
                }
                else {
                    maxVolume = Math.max(height[i] * (j-i), maxVolume);
                }
            }
        }
        return maxVolume;
    }
    //two pointer approach
    public int maxArea_2(int[] height) {
        int maxarea = 0, l = 0; r = height.length - 1;
        while (l < r) {
            maxarea =  Math.max(maxarea, Math.min(height[l], height[r]) * (r - 1));
            if (height[l] < height[r])
                i++;
            else
                r--;
        }
        return maxarea;
    }
}