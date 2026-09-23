class Solution {
    public boolean isPerfectSquare(int num) {
        // Use long to prevent integer overflow when calculating mid * mid
        long left = 1;
        long right = num;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1; // Square is too small, look higher
            } else {
                right = mid - 1; // Square is too big, look lower
            }
        }
        
        return false;
    }
}