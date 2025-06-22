class Solution {
    public String[] divideString(String s, int k, char fill) {
        int i=0;
        List<String>result=new ArrayList<>();
        while(i<s.length()){
            int end=i+k;
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<end && j<s.length();j++){
                sb.append(s.charAt(j));
            }
            while(sb.length()<k){
                sb.append(fill);
            }
            result.add(sb.toString());
            i=i+k;

        }
        return result.toArray(new String[0]);

        
    }
}