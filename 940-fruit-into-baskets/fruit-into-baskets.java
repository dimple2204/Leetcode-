class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits==null || fruits.length==0) return 0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int l=0;
        int r=0;
        int max=0;
        while(r<fruits.length){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2){
                int leftfruit=fruits[l];
                map.put(leftfruit,map.get(leftfruit)-1);
                if(map.get(leftfruit)==0){
                    map.remove(leftfruit);
                }
                l++;
            }

            max=Math.max(max,r-l+1);
            r++;



        }
        return max;
        
    }
}