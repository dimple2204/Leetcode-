class Solution {
    public int findClosest(int x, int y, int z) {
        int dx=Math.abs(y-z);
         int dy=Math.abs(x-z);
         if(dx<dy) return 2;
         if(dx>dy) return 1;

         return 0;

        
    }
}