class Solution {
    public int firstUniqChar(String s) {
        int[] counts = new int[26];
        
        // Step 1: Count the frequency of every character in the string
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        
        // Step 2: Loop through the string again to find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (counts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        // If no unique character is found, return -1
        return -1;
    }
}