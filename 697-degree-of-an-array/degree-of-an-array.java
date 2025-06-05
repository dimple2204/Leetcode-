class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer>count=new HashMap<>();
          HashMap<Integer,Integer>first=new HashMap<>();

       int degree=0;
       int minLen=nums.length;
       for(int i=0;i<nums.length;i++){
        int a=nums[i];
        first.putIfAbsent(a,i);
        count.put(a,count.getOrDefault(a,0)+1);
        if(count.get(a)>degree){
            degree=count.get(a);
            minLen=i-first.get(a)+1;

        }
        else if(count.get(a)==degree){
             minLen=Math.min(minLen,i-first.get(a)+1);
        }
       }
       return minLen;
        
    }
}