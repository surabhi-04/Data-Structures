class Solution {
    public int addDigits(int num) {
        // Keep going as long as the number has more than 1 digit
        while (num > 9) {
            int sum = 0;
            
            // Extract and sum each digit
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            
            // Set num to the new sum for the next iteration
            num = sum;
        }
        
        return num;
    }
}