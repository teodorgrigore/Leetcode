// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class removeDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int uniques = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i - 1]) {
                nums[uniques++] = nums[i];
            }
        }
        return uniques;
    }
}
