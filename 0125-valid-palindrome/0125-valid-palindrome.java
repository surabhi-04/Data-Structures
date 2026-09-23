class Solution {
    public boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Reverse the string and compare
        String reversed = new StringBuilder(cleaned).reverse().toString();
        
        return cleaned.equals(reversed);
    }
}