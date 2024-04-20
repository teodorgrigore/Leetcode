import java.util.HashSet;
import java.util.Set;

/*
1. Add all elements into a HashSet
2. Iterate through array: - if current - 1 not in hashset -> current is first element in sequence
3. Check how many consecutive elem are in set => calculate len of each sequence
4. Stop if current max sequence is larger than half of the array (there is no way it could be a bigger sequence after that)
*/


public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> values = new HashSet<>();
        for(int num:nums) values.add(num);

        int longest = 1;

        for (int num : nums) {
            if (!values.contains(num - 1)) {
                int len = 0;
                while (values.contains(num + len)) {
                    len++;
                }
                longest = Math.max(longest, len);
            }
            if (longest > nums.length / 2) break;
        }
        return longest;
    }
}
