class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result=new ArrayList<>();
        if(s==null || p==null) return result;
         int n = s.length(), m = p.length();
          if (n < m) return result;
                  int[] need = new int[26];
                  for(char c:p.toCharArray()){
                    need[c-'a']++;
                  }
                     int matched = 0; 
                     for(int i=0;i<n;i++){
                        int inidx=s.charAt(i)-'a';
                        if(need[inidx]>0) matched++;
                           need[inidx]--;
                           if(i>=m){
                            int outidx=s.charAt(i-m)-'a';

                         
                            need[outidx]++;
                            if(need[outidx]>0) matched--;

                           }

                           if(matched==m){
                            result.add(i-m+1);
                           }
                     }
                     return result;


        
    }
}