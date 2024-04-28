public class CountingBits {

    class Solution {
        // "Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous."
        /*
    
                // one bit group
            0=   0(0)
            1=   1(1)
            // two bits group
            2=  10(1) = 10(higest bit) + 0
            3=  11(2) = 10 + 1
            // three bits group
            4= 100(1) = 100(higest bit) + 0
            5= 101(2) = 100 + 1
            6= 110(2) = 100 + 2
            7= 111(3) = 100 + 3
            // four bits group
            8=1000(1)=1000(higest bit) + 0
            9=1001(2) = 1000 + 1
            10=1010(2) = 1000 + 2
            11=1011(3) = 1000 + 3
            12=1100(2) = 1000 + 4
            13=1101(3) = 1000 + 5
            14=1110(3) = 1000 + 6
            15=1111(4) = 1000 + 7
            // five bits group
            16=10000(1)
            ...and so on
    
        */
        
        public int[] countBits(int n) {
            int[] res = new int[n + 1];
    
            int currPow2 = 2;
            if (n == 0) return res;
            res[1] = 1;
            if (n == 1) {
                return res;
            }
            int idx = 2;
            while (idx <= n) {
                if (idx == currPow2 << 1) {
                    currPow2 = idx;
                }
    
                res[idx] = 1 + res[idx - currPow2];
                
                idx++;
            }
            return res; 
    
        }
    }
    
}
