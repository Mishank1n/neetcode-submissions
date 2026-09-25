class Solution {
    public String encode(List<String> strs) {
        if (strs.size()==0){
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            if (i==strs.size()-1) {
                if (strs.get(i).isEmpty()){
                    res.append("&^");
                } else {
                    res.append(strs.get(i));
                }
            } else {
                if (strs.get(i).isEmpty()){
                    res.append("&^"+"#%");
                } else {
                    res.append(strs.get(i)).append("#%");
                }
            }
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.equals("")){
            return new ArrayList<>();
        }
        String[] strings = str.split("#%");
        List<String> res = new ArrayList<>();
        for (int i = 0; i < strings.length ; i++) {
            if (strings[i].equals("&^")){
                res.add("");
            } else {
                res.add(strings[i]);
            }
        }
        return res;
    }
}