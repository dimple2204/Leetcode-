class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result=0;
        int n=nums.length;
        int i=0;
        while(i<n){
            long l=0;
            if(nums[i]==0){
                while(i<n && nums[i]==0){
                    l++;
                    i++;
                    
                }
            result+=l*(l+1)/2;
            }
            else{
                i++;
            
            }
           
        }
        return result;

    }
}