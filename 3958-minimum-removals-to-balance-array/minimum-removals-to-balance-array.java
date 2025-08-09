class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        int maxlen=0;
        int left=0;
        Arrays.sort(nums);
        for(int right=0;right<n;right++){
            while((long)nums[right]>(long)nums[left]*k){
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return n-maxlen;

        
    }
}