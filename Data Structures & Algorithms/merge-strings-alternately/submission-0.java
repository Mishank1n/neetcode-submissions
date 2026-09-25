class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = 0;
        int r = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (l!=word1.length() && r!=word2.length()){
            stringBuilder.append(word1.charAt(l));
            l++;
            stringBuilder.append(word2.charAt(r));
            r++;
        }
        if (l!=word1.length()){
            stringBuilder.append(word1.substring(l));
        } else if (r!=word2.length()){
            stringBuilder.append(word2.substring(r));
        }    
        return stringBuilder.toString();
    }
}