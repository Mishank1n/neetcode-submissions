class Solution {
    public static boolean isAnagram(String s, String t) {
        Map<String, Integer> sMap = new HashMap<>();
        for(String c : s.split("")){
            if (sMap.containsKey(c)){
                sMap.put(c, sMap.get(c)+1);
            } else {
                sMap.put(c, 1);
            }
        }
        Map<String, Integer> tMap = new HashMap<>();
        for(String c : t.split("")){
            if (tMap.containsKey(c)){
                tMap.put(c, tMap.get(c)+1);
            } else {
                tMap.put(c, 1);
            }
        }
        return sMap.equals(tMap);
    }
}