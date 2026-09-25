class Solution {
    public static String simplifyPath(String path) {
        Stack<String> pathStack = new Stack<>();
        String[] pathElements = path.split("/");
        for (int i = 0; i < pathElements.length; i++) {
            String elem = pathElements[i];
            if (elem.equals("..")){
                if (!pathStack.isEmpty()){
                    pathStack.pop();
                }
            } else if (!elem.equals("") && !elem.equals(".")){
                pathStack.push(elem);
            }
        }
        return "/"+String.join("/", pathStack);
    }
}