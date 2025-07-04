class Solution {
    public int findPairs(int[] nums, int k) {
        int n=nums.length;
        int cnt=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num:map.keySet()){
            if(k==0){
                if(map.get(num)>1) cnt++;
            }
            else{
                if(map.containsKey(num+k)) cnt++;
            }

        }
        return cnt;


        
    }
}