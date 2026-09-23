import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // HashSet.add() returns false if the element is already in the set
            if (!seen.add(num)) {
                return true; 
            }
        }
        
        return false;
    }
}