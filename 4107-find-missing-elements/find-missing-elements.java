class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>result=new ArrayList<>();
        if(nums==null || nums.length==0){
            return result;
        }
        int min=Integer.MAX_VALUE;
         int max=Integer.MIN_VALUE;

         for(int num:nums){
            if(num<min) min=num;
            if(num>max) max=num;
         }
         HashSet<Integer>set=new HashSet<>();
         for(int num:nums){
            set.add(num);
         }
         for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                result.add(i);
            }
         }
         return result;

        
    }
}