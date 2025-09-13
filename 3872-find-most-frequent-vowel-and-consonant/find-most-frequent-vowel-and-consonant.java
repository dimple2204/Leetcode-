class Solution {
    public int maxFreqSum(String s) {
         Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
     
         int maxVowel = 0;
        int maxConsonant = 0;
        Map<Character,Integer>vowelMap=new HashMap<>();
         Map<Character,Integer>constMap=new HashMap<>();

         for(char c:s.toCharArray()){
            if(set.contains(c)){
                vowelMap.put(c,vowelMap.getOrDefault(c,0)+1);
                maxVowel =Math.max(maxVowel,vowelMap.get(c));
            }
            else{
            constMap.put(c,constMap.getOrDefault(c,0)+1);
             maxConsonant =Math.max(maxConsonant,constMap.get(c));
            }
         }
         return  maxVowel+maxConsonant;
        
    }
}