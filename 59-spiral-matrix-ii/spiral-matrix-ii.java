class Solution {
    public int[][] generateMatrix(int n) {
        int[][]matrix=new int[n][n];
        int top=0;
        int bottom=n-1;
        int l=0;
        int r=n-1;
        int num=1;
        while(num<=n*n){
            for(int j=l;j<=r;j++){
                matrix[top][j]=num++;


            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][r]=num++;
            }
            r--;
            for(int j=r;j>=l;j--){
                matrix[bottom][j]=num++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                matrix[i][l]=num++;
            }
            l++;
        }
           return matrix;
        
    }
}