class Solution {
    public String mergeAlternately(String word1, String word2) {
       int l1 = 0, r1 = word1.length()-1; 
       int l2 = 0, r2 = word2.length()-1;
       StringBuilder res = new StringBuilder();
       while(l1<=r1 && l2<=r2) {
            if(l1>l2){
                res.append(word2.charAt(l2));
                l2++;
            } else {
                res.append(word1.charAt(l1));
                l1++;
            }
       }
       res.append(word1.substring(l1));
       res.append(word2.substring(l2));
       return res.toString();
    }
}