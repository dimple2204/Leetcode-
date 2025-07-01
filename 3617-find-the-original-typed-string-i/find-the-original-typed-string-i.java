class Solution {
    public int possibleStringCount(String word) {
        List<int[]> groups = new ArrayList<>();
        int n = word.length();

       
        for (int i = 0; i < n;) {
            char c = word.charAt(i);
            int j = i;
            while (j < n && word.charAt(j) == c) j++;
            groups.add(new int[]{c, j - i});
            i = j;
        }

        Set<String> variants = new HashSet<>();
        variants.add(word);  
        for (int i = 0; i < groups.size(); i++) {
            int[] group = groups.get(i);
            if (group[1] >= 2) {
                for (int len = 1; len < group[1]; len++) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < groups.size(); j++) {
                        int ch = groups.get(j)[0];
                        int count = (i == j) ? len : groups.get(j)[1];
                        sb.append(String.valueOf((char) ch).repeat(count));
                    }
                    variants.add(sb.toString());
                }
            }
        }

        return variants.size();
        
    }
}