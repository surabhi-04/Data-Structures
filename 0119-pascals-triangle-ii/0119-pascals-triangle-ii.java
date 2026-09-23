import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        for (int i = 0; i <= rowIndex; i++) {
            // Add a 1 at the end of the row
            row.add(1);
            
            // Update the elements in between, working backwards
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        
        return row;
    }
}