public class HouseRobber {
    public int rob(int[] nums) {
        int dp0 = nums[0];
        if (nums.length == 1) {
            return nums[0];
        }
        int dp1 = Math.max(dp0, nums[1]);
        int temp = 0;
        for (int i = 2; i < nums.length; ++i) {
            temp = dp1;
            dp1 = Math.max(dp0 + nums[i], dp1);
            dp0 = temp;
        }
        return dp1;
    }
}