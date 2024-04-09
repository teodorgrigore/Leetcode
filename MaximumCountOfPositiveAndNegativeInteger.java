// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/

// Time complexity: O(log(n)), Space: O(1)
public class MaximumCountOfPositiveAndNegativeInteger {
    public int maximumCount(int[] nums) {
        // Find the number of 1's by subtracting the index of the first 1 from the array length
        int countOfOnes = nums.length - firstOccurrence(nums, 1);
        // Find the first occurrence index of 0, which is also the count of 0's
        int countOfZeros = firstOccurrence(nums, 0);
        // Return the max count between 0's and 1's
        return Math.max(countOfOnes, countOfZeros);
    }


    // Helper method to find the first occurrence index of 'x' in the sorted array 'nums'
    private int firstOccurrence(int[] nums, int x) {
        int left = 0;
        int right = nums.length;
        int mid = 0;
        // Binary search to find the first occurrence of 'x'
        while (left < right) {
            mid = (left + right) >> 1; // Equivalent to (left + right) / 2 but faster
            // If mid element is greater than or equal to x, we move the right boundary
            if (nums[mid] >= x) {
                right = mid;
            } else {
                // If mid element is less than x, we move the left boundary
                left = mid + 1;
            }
        }
        // 'left' will point to the first occurrence of 'x' or nums.length if 'x' is not found
        System.out.println(left + " " + right + " " + mid);
        return left;
    }
}