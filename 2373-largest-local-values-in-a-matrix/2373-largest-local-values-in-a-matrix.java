class Solution {
    public int[][] largestLocal(int[][] grid) {
        int size = grid.length-2;
        int[][] box = new int[size][size];

        for(int r=0; r<size; r++){
            for(int c=0;c<size; c++){
                box[r][c]= maxValue(grid,r,c);
            }
        }
        return box;
    }

    public int maxValue(int[][] grid, int i, int j){

        int max = 0;
        for(int row=i; row<i+3; row++){
            for(int col=j;col<j+3; col++){
                max = Math.max(grid[row][col], max); 
            }
        }
        return max;
    }
}