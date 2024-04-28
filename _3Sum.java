import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _3Sum {
class Solution {
    // Sorting + two pointer
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> triplet = new LinkedList<>();
        int curr, l, r, currSum;
        for (int i = 0; i < nums.length; ++i) {
            curr = nums[i];
            // Since sum3 needs to add up to 0, we will only check the next numbers, so it is impossible
            // to find triplet if smallest elem is positive
            if (curr > 0) {
                break;
            }
            // Skip any duplicate left-most element
            if (i > 0 && curr == nums[i - 1]) {
                continue;
            }
            l = i + 1;
            r = nums.length - 1;

            while (l < r) {
                currSum = curr + nums[l] + nums[r];
                if (currSum < 0) {
                    l++;
                } else if (currSum > 0) {
                    r--;
                } else {
                    triplet.addAll(Arrays.asList(curr, nums[l], nums[r]));
                    res.add(new ArrayList(triplet));
                    triplet.clear();
                    // Skip any duplicate middle or right-most element
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    l++;
                    r--;
                }
            }
        }
        return res;
    }
}
}
