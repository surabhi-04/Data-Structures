class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        // Ensure start is always smaller than destination to simplify traversal
        int minStop = Math.min(start, destination);
        int maxStop = Math.max(start, destination);
        
        int clockwiseDistance = 0;
        int totalDistance = 0;
        
        for (int i = 0; i < distance.length; i++) {
            totalDistance += distance[i];
            
            // Add to clockwise distance if the current stop is between start and destination
            if (i >= minStop && i < maxStop) {
                clockwiseDistance += distance[i];
            }
        }
        
        // Return the minimum of the clockwise path and the counterclockwise path
        return Math.min(clockwiseDistance, totalDistance - clockwiseDistance);
    }
}