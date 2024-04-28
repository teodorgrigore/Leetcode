public class TwoSumII {
    // Two pointer    
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            
            int l = 0, r = numbers.length - 1;
            int sum;
            while (l < r) {
                sum = numbers[l] + numbers[r];
                if (sum < target) {
                    l++;
                } else if (sum > target){
                    r--;
                } else {
                    int[] res = new int[2];
                    res[0] = l + 1;
                    res[1] = r + 1;
                    return res;
                }
            }
            return null;
        }
    }   
}
