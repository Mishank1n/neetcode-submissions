class Solution {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && stack.peek()[0]<temperatures[i]){
                int[] peek = stack.pop();
                res[peek[1]] = i - peek[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return res;
    }
}
