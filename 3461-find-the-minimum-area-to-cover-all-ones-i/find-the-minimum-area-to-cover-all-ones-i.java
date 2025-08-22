class Solution {
    public int minimumArea(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int minRow=rows;
        int minCol=cols;
        int maxRow=-1;
        int maxCol=-1;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]==1){
                    minRow=Math.min(minRow,r);
                    maxRow=Math.max(maxRow,r);
                    minCol=Math.min(minCol,c);
                    maxCol=Math.max(maxCol,c);
                }
            }
        }
        if(maxRow==-1) return 0;
        return (maxRow-minRow+1)*(maxCol-minCol+1);
        
    }
}