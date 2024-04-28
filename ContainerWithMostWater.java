public class ContainerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int res = 0;
            int n = height.length;
            int l = 0, r = n - 1;
            int currWater;
            while (l < r) {
                currWater = Math.min(height[l], height[r]) * (r - l);
                res = Math.max(res, currWater);
                if (height[l] < height[r]) {
                    l++;
                } else {
                    r--;
                }
            }
            return res;
        }
    }
}
