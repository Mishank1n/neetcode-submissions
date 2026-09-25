class Solution {
    public static int[] getConcatenation(int[] nums) {
        int[] b = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            b[i] = nums[i];
            b[i+nums.length] = nums[i];
        }
        return b;
    }
}