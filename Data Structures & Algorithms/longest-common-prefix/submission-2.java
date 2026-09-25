public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        String cur = "";
        for (int i = 0; i < strs[0].length() ; i++) {
            cur+=strs[0].charAt(i);
            boolean flag = true;
            for (int j = 1; j < strs.length ; j++) {
                if (strs[j].length()<=i || !strs[j].substring(0, i+1).equals(cur)){
                    flag = false;
                    break;
                }
            }
            if (!flag){
                return res.toString();
            }
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }
}