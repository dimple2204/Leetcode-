class Solution {
    public int countArrangement(int n) {
        boolean vis[]=new boolean[n+1];
        return backtrack(1,n,vis);
    }
    private int backtrack(int pos,int n,boolean[]vis){
        int cnt=0;
        if(pos>n) return 1;
       for(int i=1;i<=n;i++){
        if(!vis[i] && (pos%i==0 || i%pos==0)){
            vis[i]=true;
            cnt+=backtrack(pos+1,n,vis);
            vis[i]=false;
        }
       }
       return cnt;
        
    }
}