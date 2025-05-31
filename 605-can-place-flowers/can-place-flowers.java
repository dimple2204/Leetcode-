class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
        int cnt=0;
        for(int i=0;i<len;i++){
            if(flowerbed[i]==0){
                boolean left=(i==0||flowerbed[i-1]==0);
                boolean right=(i==len-1||flowerbed[i+1]==0);
                if(left && right){
                    flowerbed[i]=1;
                    cnt++;
                }
                if(cnt>=n) return true;

            }
             if(cnt>=n) return true;

        }
       
        return false;
        
        
    }
}