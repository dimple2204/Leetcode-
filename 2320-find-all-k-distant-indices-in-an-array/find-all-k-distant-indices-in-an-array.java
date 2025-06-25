class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n=nums.length;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
           if(nums[i]==key) {
            int start=Math.max(i-k,0);
            int end=Math.min(i+k,n-1);

            if(set.size()-1>=start){
                start=set.size();
            }
            for(int j=start;j<=end;j++){
                set.add(j);
            }

           }
        }
         List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
        
    }
}