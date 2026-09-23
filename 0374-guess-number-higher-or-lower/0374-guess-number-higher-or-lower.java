/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        
        while (left <= right) {
            // Calculate mid this way to prevent integer overflow
            int mid = left + (right - left) / 2;
            int result = guess(mid);
            
            if (result == 0) {
                return mid; // We found the picked number
            } else if (result == -1) {
                right = mid - 1; // Our guess was too high, search lower half
            } else {
                left = mid + 1; // Our guess was too low, search upper half
            }
        }
        
        return -1;
    }
}