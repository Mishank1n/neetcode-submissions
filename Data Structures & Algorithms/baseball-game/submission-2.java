class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String operation : operations) {
            switch (operation){
                case "+" -> {
                    stack.add(stack.get(stack.size()-1)+ stack.get(stack.size()-2));
                }
                case "C" -> {
                    stack.pop();
                }
                case "D" -> {
                    stack.add(stack.get(stack.size()-1)*2);
                }
                default -> {
                    stack.add(Integer.valueOf(operation));
                }
            }
        }
        return stack.stream().mapToInt(integer -> integer).sum();
    }
}