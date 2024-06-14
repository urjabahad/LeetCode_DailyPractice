class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] xCoordinates = new int[n];
        
        for (int i = 0; i < n; i++) {
            xCoordinates[i] = points[i][0];
        }
        
        Arrays.sort(xCoordinates);
        
        int maxWidth = 0;
        for (int i = 1; i < n; i++) {
            int width = xCoordinates[i] - xCoordinates[i - 1];
            if (width > maxWidth) {
                maxWidth = width;
            }
        }
        
        return maxWidth;
    }
}
