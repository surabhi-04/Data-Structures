class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int maxLength = 1;
        int currentLength = 1;
        
        // Start from the second element and compare with the previous one
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
            } else {
                // The sequence broke, reset the current length
                currentLength = 1;
            }
            
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, currentLength);
        }
        
        return maxLength;
    }
}