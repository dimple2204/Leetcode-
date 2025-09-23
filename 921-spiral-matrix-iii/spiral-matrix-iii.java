class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][]result=new int[rows*cols][2];
        int [][]directions={{0,1},{1,0},{0,-1},{-1,0}};
        int count=0;
        int steps=1;
        int dir=0;

          int r = rStart, c = cStart;

          result[count++]=new int[]{r,c};
         while(count<rows*cols){
            for(int i=0;i<2;i++){
                for(int j=0;j<steps;j++){
                    r=r+directions[dir][0];
                     c=c+directions[dir][1];

                     if(r>=0 && r<rows && c>=0 && c<cols ){
                        result[count++]=new int[]{r,c};
                     }
                }
                dir=(dir+1)%4;
            }
            steps++;

            
         }
      return result;
        

        
    }
}