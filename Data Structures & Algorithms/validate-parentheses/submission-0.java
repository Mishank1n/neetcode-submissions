class Solution {
    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        String[] chars = s.split("");
        for (int i = 0; i<chars.length; i++) {
            String ch = chars[i];
            if (stack.size()==0){
                stack.add(ch);
                continue;
            }
            String prevCh = stack.pop();
            switch (ch){
                case "}" -> {
                    if (!prevCh.equals("{")){
                        return false;
                    }
                    break;
                }
                case "]" -> {
                    if (!prevCh.equals("[")){
                        return false;
                    }
                    break;
                }
                case ")" -> {
                    if (!prevCh.equals("(")){
                        return false;
                    }
                    break;
                }
                default -> {
                    stack.add(prevCh);
                    stack.add(ch);
                }
            }
        }
        if (stack.size()!=0){
            return false;
        }
        return true;
    }
}
