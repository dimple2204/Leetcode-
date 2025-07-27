class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        Map<Character,Integer>need=new HashMap<>();
        Map<Character,Integer>window=new HashMap<>();
        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left=0;
        int right=0;
        int start=0;
        int valid=0;
        int minLen=Integer.MAX_VALUE;
        while(right<s.length()){
            char c=s.charAt(right);
            right++;
            if(need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if(need.get(c).equals(window.get(c))){
                    valid++;
                }
            }
            while(valid==need.size()){
                if(right-left<minLen){
                    start=left;
                    minLen=right-left;
                }
            
            char d=s.charAt(left);
            left++;
            if(need.containsKey(d)){
                if (window.get(d).equals(need.get(d))) {
    valid--;
}
                window.put(d,window.get(d)-1);
            }
            }

        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);


        
    }
}