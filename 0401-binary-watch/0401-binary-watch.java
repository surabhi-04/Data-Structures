import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> times = new ArrayList<>();
        
        // Loop through all valid hours (0-11) and minutes (0-59)
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                
                // If the total number of set bits (LEDs) matches our target
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    // Format the string. %d is the hour, %02d ensures minutes always have 2 digits
                    times.add(String.format("%d:%02d", h, m));
                }
            }
        }
        
        return times;
    }
}