class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[]broken=new boolean[26];
        for(char ch:brokenLetters.toCharArray()){
            broken[ch-'a']=true;
        }
        String[]words=text.split(" ");
        int count=0;
        for(String word:words){
            boolean canType=true;
            for(char ch:word.toCharArray()){
                if(broken[ch-'a']){
                    canType=false;
                }
            }
            if(canType==true) count++;
        }
        return count;

        
    }
}