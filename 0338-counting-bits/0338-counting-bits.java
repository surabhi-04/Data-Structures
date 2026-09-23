class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            // The number of 1s in 'i' is the same as 'i' shifted right by 1,
            // plus 1 if the current number 'i' is odd.
            ans[i] = ans[i >> 1] + (i & 1);
        }
        
        return ans;
    }
}