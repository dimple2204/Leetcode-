class Solution {
   
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>>track=new HashMap<>();

        for(int[]log:logs){
            int id=log[0];
            int timestamp=log[1];
            if(!track.containsKey(id)){
                track.put(id,new HashSet<>());
            }
            track.get(id).add(timestamp);

        }
        int []ans=new int[k];
        for(int id:track.keySet() ){
            int uam=track.get(id).size();
            ans[uam-1]++;
        }
          return ans;
        
    }
}