class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Array to store the count of each lowercase letter
        int[] letterCounts = new int[26];
        
        // Step 1: Count all the letters available in the magazine
        for (char c : magazine.toCharArray()) {
            letterCounts[c - 'a']++;
        }
        
        // Step 2: Try to write the ransom note
        for (char c : ransomNote.toCharArray()) {
            // If we are out of this specific letter, we can't write the note
            if (letterCounts[c - 'a'] == 0) {
                return false;
            }
            // Otherwise, "use" the letter by decrementing its count
            letterCounts[c - 'a']--;
        }
        
        return true;
    }
}