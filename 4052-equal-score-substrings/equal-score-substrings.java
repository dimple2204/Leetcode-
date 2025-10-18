class Solution {
    public boolean scoreBalance(String s) {
        int n=s.length();
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=s.charAt(i)-'a'+1;
            

        }
        int prefixSum=0;
        for(int i=0;i<n-1;i++){
            prefixSum+=s.charAt(i)-'a'+1;
            int rightsum=totalsum-prefixSum;
            if(prefixSum==rightsum){
                return true;
            }
        }
        return false;
        
    }
}