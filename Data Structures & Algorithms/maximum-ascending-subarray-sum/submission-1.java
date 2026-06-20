class Solution {
    public int maxAscendingSum(int[] nums) {
        

        int sum = nums[0];
        int ans = nums[0];

        for (int i =0; i<nums.length-1; i++)
        {
            if (nums[i+1]>nums[i])
            {
                sum = sum + nums[i+1];
                if (ans<sum){
                    ans = sum;
                }
            }
            else
            {
                sum = nums[i+1];
            }
        }
    return ans;
    }
}