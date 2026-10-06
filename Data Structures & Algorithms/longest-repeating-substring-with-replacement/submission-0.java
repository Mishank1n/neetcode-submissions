class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new  HashMap<>();
        int maxF = 0;
        int res = 0;
        int l = 0;

        for (int r = 0; r<s.length(); r++){
            Character ch = s.charAt(r);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
            maxF = Math.max(maxF, count.get(ch));

            while ((r-l+1)-maxF>k){
                count.put(s.charAt(l), count.get(s.charAt(l))-1);
                l++;
            }

            res = Math.max(r-l+1, res);
        }
        return res;
    }
}
