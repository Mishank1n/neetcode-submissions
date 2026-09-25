public class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> map  = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        if (strs.length==1){
            res.add(List.of(strs[0]));
            return res;
        }
        for (int i = 0; i < strs.length; i++) {
            HashMap<Character, Integer> curStr = new HashMap<>();
            for (int j = 0; j < strs[i].length(); j++) {
                curStr.put(strs[i].charAt(j), curStr.getOrDefault(strs[i].charAt(j), 0)+1);
            }
            if (!map.containsKey(curStr)){
                ArrayList<String> curSet = new ArrayList<>();
                curSet.add(strs[i]);
                map.put(curStr, curSet);
            } else {
                ArrayList<String> list = (ArrayList<String>) map.get(curStr);
                list.add(strs[i]);
            }
        }
        for (List<String> resList:map.values()){
            res.add(resList);
        }
        return res;
    }
}