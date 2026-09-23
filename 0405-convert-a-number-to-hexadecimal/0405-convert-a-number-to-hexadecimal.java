class Solution {
    public String toHex(int num) {
        // Edge case for zero
        if (num == 0) return "0";
        
        // Map of numbers 0-15 to their hex character equivalents
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder result = new StringBuilder();
        
        // Process the number until it becomes 0
        while (num != 0) {
            // Extract the last 4 bits using bitwise AND (15 is 1111 in binary)
            result.append(hexChars[num & 15]);
            
            // Unsigned shift right by 4 bits to process the next chunk
            num >>>= 4; 
        }
        
        // We built the string backwards (from rightmost bits to leftmost), so reverse it
        return result.reverse().toString();
    }
}