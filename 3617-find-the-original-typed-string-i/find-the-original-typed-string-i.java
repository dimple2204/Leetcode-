class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        List<Character> chars = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        for (int i = 0; i < n;) {
            char c = word.charAt(i);
            int j = i;
            while (j < n && word.charAt(j) == c) j++;
            chars.add(c);
            counts.add(j - i);
            i = j;
        }

        Set<String> variants = new HashSet<>();
        variants.add(word); 

       
        for (int k = 0; k < counts.size(); k++) {
            int count = counts.get(k);
            if (count >= 2) {
                for (int r = 1; r < count; r++) {
                    int totalLength = n - (count - r);
                    char[] arr = new char[totalLength];
                    int index = 0;
                    for (int m = 0; m < chars.size(); m++) {
                        int len = (m == k) ? r : counts.get(m);
                        Arrays.fill(arr, index, index + len, chars.get(m));
                        index += len;
                    }
                    variants.add(new String(arr));
                }
            }
        }

        return variants.size();
        
    }
}