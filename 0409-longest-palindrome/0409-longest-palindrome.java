import java.util.HashSet;

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        
        for (char c : s.toCharArray()) {
            // If the set already has this character, we found a pair!
            if (set.contains(c)) {
                maxLength += 2; // Add 2 to our palindrome length
                set.remove(c);  // Remove the character since its pair is used
            } else {
                // Otherwise, add it to the set to wait for a match
                set.add(c);
            }
        }
        
        // If there are any characters left without a pair, we can use exactly 
        // ONE of them as the unique middle character of the palindrome.
        if (!set.isEmpty()) {
            maxLength += 1;
        }
        
        return maxLength;
    }
}