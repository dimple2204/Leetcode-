class Solution {
    private int[][]directions={{1,0},{-1,0},{0,1},{0,-1}};
    private int m,n;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
          List<List<Integer>> result = new ArrayList<>();
          if(heights==null || heights.length==0) return result;
           m=heights.length;
           n=heights[0].length;

          boolean[][]pacific=new boolean[m][n];
          boolean[][]atlantic=new boolean[m][n];

          for(int i=0;i<m;i++){
            dfs(heights,pacific,i,0,heights[i][0]);
             dfs(heights,atlantic,i,n-1,heights[i][n-1]);

          }
          for(int j=0;j<n;j++){
            dfs(heights,pacific,0,j,heights[0][j]);
            dfs(heights,atlantic,m-1,j,heights[m-1][j]);
          }
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
          }
          return result;






        
    }
    private void dfs(int[][] heights, boolean[][] visited,int i,int j,int prevHeight){
        if(i < 0 || j < 0 || i >= m || j >= n || visited[i][j] || heights[i][j]<prevHeight){
            return;
        }
        visited[i][j]=true;
        for(int[]dir:directions){
            dfs(heights,visited,i+dir[0],j+dir[1],heights[i][j]);
        }
    }
}