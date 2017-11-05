class Solution {
    // brute force
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> bigList = new ArrayList<List<Integer>>();
        
        int i, j, k, m;
        
        for (i=0; i<nums.length-2; i++)
            for (j=i+1; j<nums.length-1; j++)
                for (k=j+1; k<nums.length; k++) {
                    int sign = 0;
                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        List<Integer> smallList = new ArrayList<>();
                        smallList.add(nums[i]);
                        smallList.add(nums[j]);
                        smallList.add(nums[k]);
                        for (m=0; m<bigList.size(); m++) {
                            if (bigList.get(m).containsAll(smallList) && smallList.containsAll(bigList.get(m))){
                                sign = 1;
                            }
                        }
                        if (sign == 0) {
                            bigList.add(smallList);
                        }
                        
                    }
                }
        return bigList;
    }
}