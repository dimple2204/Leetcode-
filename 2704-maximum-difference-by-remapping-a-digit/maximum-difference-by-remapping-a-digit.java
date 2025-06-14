class Solution {
    public int minMaxDifference(int num) {
       
        String str = Integer.toString(num);

        
        char toReplaceMax = ' ';
        for (char c : str.toCharArray()) {
            if (c != '9') {
                toReplaceMax = c;
                break;
            }
        }
        String maxStr = str;
        if (toReplaceMax != ' ') {
            maxStr = str.replace(toReplaceMax, '9');
        }

        char toReplaceMin = str.charAt(0);
        String minStr = str.replace(toReplaceMin, '0');

       
        int max = Integer.parseInt(maxStr);
        int min = Integer.parseInt(minStr);

        return max - min;
    }
}

        
    