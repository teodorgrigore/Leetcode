import java.util.Stack;

public class DailyTemperatures {


/*
Similar to Next Greatest Element I -> usage of monotonic stack

Stack has always decreasing order - the stack keeps the indexes
When we pop, we update the result for the poped index by the difference (i - idx)
*/


class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        
        int[] res = new int[temperatures.length]; // 0, 0, 0, 0, ..

        for (int i = 0; i < temperatures.length; ++i) {

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = i - idx;
            }
            stack.push(i);
        }


        return res;


    }
}
}
