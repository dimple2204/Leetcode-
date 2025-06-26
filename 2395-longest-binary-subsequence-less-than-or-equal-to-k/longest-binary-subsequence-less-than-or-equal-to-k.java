class Solution {
    public int longestSubsequence(String s, int k) {
         int n = s.length();
        int count = 0;
        int zeros = 0;
        long val = 0;
        long pow = 1;

        
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '0') {
                count++;
            } else {
                
                if (pow <= k) {
                    val += pow;
                    if (val <= k) {
                        count++;
                    } else {
                        val -= pow; 
                    }
                }
            }

            
            if (pow <= k) pow <<= 1;
        }

        return count;
        
    }
}