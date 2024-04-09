public class HouseRobberII {
    public int rob1(int[] nums, int start, int end) {
        int dp0 = 0;
        int dp1 = 0;
        int temp = 0;
        for (int i = start; i < end; ++i) {
            temp = dp1;
            dp1 = Math.max(dp0 + nums[i], dp1);
            dp0 = temp;
        }
        return dp1;
    }

    public int rob(int[] nums) {
        return Math.max(nums[0], (Math.max(this.rob1(nums, 1, nums.length), this.rob1(nums, 0, nums.length - 1))));
        // Stream.of(first, second, third).max(Integer::compareTo).get()
    }
}
