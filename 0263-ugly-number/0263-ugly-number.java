class Solution {
    public boolean isUgly(int n) {
        // Ugly numbers are strictly positive integers
        if (n <= 0) return false;
        
        // Keep dividing by 2, 3, and 5 as long as there is no remainder
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        
        // If the number was only made of 2s, 3s, and 5s, we will be left with exactly 1
        return n == 1;
    }
}