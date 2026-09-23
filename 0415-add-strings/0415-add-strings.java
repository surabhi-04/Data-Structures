class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        
        // Pointers starting at the end of both strings (the least significant digits)
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        
        // Continue looping as long as there are digits left in either string, 
        // OR if there is still a leftover carry to process
        while (i >= 0 || j >= 0 || carry > 0) {
            // Extract the current digit, or use 0 if we've run out of digits in that string
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            
            // Calculate the total for this column
            int sum = digit1 + digit2 + carry;
            
            // The new carry is the tens digit of the sum (e.g., 15 / 10 = 1)
            carry = sum / 10;
            
            // Append only the ones digit to our result (e.g., 15 % 10 = 5)
            result.append(sum % 10);
            
            // Move our pointers one step to the left
            i--;
            j--;
        }
        
        // We built the string backwards, so we must reverse it before returning
        return result.reverse().toString();
    }
}