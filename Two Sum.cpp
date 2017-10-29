#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int i, j;
        vector<int> news(2, 0);
        for (i=0; i<nums.capacity(); i++){
            for (j=i+1; j<nums.capacity(); j++){
                if (nums[i]+nums[j] == target){
                    news[0] = i;
                    news[1] = j;
                }
            }
        }
        return news;
    }
};
