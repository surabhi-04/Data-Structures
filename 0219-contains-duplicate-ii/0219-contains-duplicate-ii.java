import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in the set, it means we found a duplicate 
            // within our allowed window size 'k'
            if (!window.add(nums[i])) {
                return true;
            }
            
            // If the window gets too large, remove the oldest element
            // to maintain a max size of 'k'
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}