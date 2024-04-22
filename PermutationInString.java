import java.util.Arrays;

public class PermutationInString {

    /*
Sliding window of size s1.len

Frequency array for s1. For s2, add current letter and remove i - window size
letter, to keep the sum of freq2 equal to window size.

If at any moment the freq arrays are equal (substring in s2 is perm/anagram of s1).
return true

*/


class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int len1 = s1.length();
        int len2 = s2.length();

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        for (int i = 0; i < len2; ++i) {
            freq2[s2.charAt(i) - 'a']++;

            if (i >= len1) {
                freq2[s2.charAt(i - len1) - 'a']--;
            }
            if (Arrays.equals(freq1, freq2)) return true;
        }
        return false;
    }
}
}
