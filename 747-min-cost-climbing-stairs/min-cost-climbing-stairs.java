class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
        return ans;
        
    }
    public int solve(int[] cost,int i,int[]dp){
        if(i==0){
            return cost[0];
        }
         if(i==1){
            return cost[1];
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=Math.min(solve(cost,i-1,dp),solve(cost,i-2,dp))+cost[i];
        return dp[i];
    }
}