class Solution {
    public static String simplifyPath(String path) {
        Stack<String> pathStack = new Stack<>();
        String[] pathElements = path.split("/");
        for (int i = 0; i < pathElements.length; i++) {
            String elem = pathElements[i];
            switch (elem) {
                case "" -> {
                    continue;
                }
                case "." -> {
                    continue;
                }
                case ".." -> {
                    if (!pathStack.isEmpty()) {
                        pathStack.pop();
                    }
                }
                default -> {
                    pathStack.push(elem+"/");
                }
            }
        }
        String res = "/";
        for (String s : pathStack) {
            res+=s;
        }
        if (res.length()>1){
            res = res.substring(0, res.length()-1);
        }
        return res;
    }
}