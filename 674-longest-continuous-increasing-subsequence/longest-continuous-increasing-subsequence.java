class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int maxLen=1;
        int currLen=1;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]>nums[i]){
                currLen++;
                maxLen=Math.max(currLen,maxLen);
            }
            else{
                 currLen=1;
            }
        }
        return  maxLen;
    }
}