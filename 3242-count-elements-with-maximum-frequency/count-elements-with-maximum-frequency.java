class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        int maxfreq=0;
        for(int f:map.values()){
            maxfreq=Math.max(f,maxfreq);

        }
        int cnt=0;
        for(int f:map.values()){
            if(f==maxfreq){
                cnt+=f;
            }
        }
        return cnt;


        
    }
}