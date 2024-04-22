public class KokoEatingBananas {

    class Solution {

        public boolean verifyK(int[] piles, int k, int max) {
            int h = 0;
    
            for (int pile : piles) {
                h += pile / k;
                if (pile % k != 0) {
                    h++;
                }
                if (h > max) {
                    return false;
                }
            }
            return true;
    
        }
    
    
        public int minEatingSpeed(int[] piles, int h) {
            
            int len = piles.length;
            int maxK = piles[0];
            int res = -1;
            int sum = 0;
            for (int i = 0; i < len; ++i) {
                maxK = piles[i] > maxK ? piles[i] : maxK;
                sum += piles[i];
            }
    
            int l = 1, r = maxK;
    
            while (l <= r) {
    
                int m = (l + r) / 2;
                if (verifyK(piles, m, h)) {
                    r = m - 1;
                    res = m;
                } else {
                    l = m + 1;
                }
            }
    
            return res;
        }
    }
}
