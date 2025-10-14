class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
       int sum=0;
       for(int num:map.keySet()){
        int freq=map.get(num);
        if(freq%k==0){
            sum+=num*freq;
        }

       }
       return sum;
        
    }
}