import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {


/*
Go through biggest array: create a monotonic decreasing stack.
Pop from the stack all elems bigger than current and add them to the
NGE Map (elem -> its NGE). When stack is balanced, push the current elem.
*/


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> stk = new Stack<>();
        Map<Integer, Integer> allNGE = new HashMap<>();

        for (int num : nums2) {

            while (!stk.empty() && num > stk.peek()) {
                allNGE.put(stk.pop(), num);
            }
            stk.push(num);
        }

        for (int i = 0; i < nums1.length; ++i) {
            nums1[i] = allNGE.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
