class Solution {
    public int avg(int x, int y, int[][] img){
        // (x,y) ; x-1,y x+1,y x,y-1 x,y+1 x-1,y-1 x-1,y+1 x+1,y-1 x+1,y+1 
        int sum = 0;
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nx = x + i;
                int ny = y + j;
                
                // Only consider valid neighbors within bounds
                if (nx >= 0 && nx < img.length && ny >= 0 && ny < img[0].length) {
                    sum += img[nx][ny];
                    count++;
                }
            }
        }
        return sum/count;
    }
    public int[][] imageSmoother(int[][] img) {
        //seperate 2d array to store result:
        int[][] result=new int [img.length][img[0].length];
        //select cell :
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[i].length;j++){
                //store the smoothing result
                result[i][j]=avg(i,j,img);
            }
        }
        return result;
    }
}