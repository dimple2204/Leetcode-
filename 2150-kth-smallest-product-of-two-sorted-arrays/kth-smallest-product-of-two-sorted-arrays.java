class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long left=-10000000000L,right=10000000000L;
        while(left<right){
            long mid=left+(right-left)/2;
            if(countLessOrEqual(nums1,nums2,mid)<k){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
        
    }
    public long countLessOrEqual(int[] nums1, int[] nums2, long mid){
        long count=0;
        for(int a:nums1){
            if(a>=0){
                count+=countPositive(nums2,a,mid);
            }
            else{
                count+=countNegative(nums2,a,mid);
            }
        }
        return count;
    }
    private long countPositive(int[]nums2,int a,long mid){
        int low=0;
        int high=nums2.length;
        while(low<high){
            int m=low+(high-low)/2;
            if((long)a*nums2[m]<=mid){
                low=m+1;
            }
            else{
                high=m;
            }
        }
        return low;
    }
    private long countNegative(int[]nums2,int a,long mid){
        int low=0;
        int high=nums2.length;
        while(low<high){
            int m=low+(high-low)/2;
            if((long)a*nums2[m]<=mid){
                high=m;
            }
            else{
                low=m+1;
            }
        }
        return nums2.length-low;
    }
}