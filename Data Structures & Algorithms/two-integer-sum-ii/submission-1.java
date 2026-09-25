class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = 1;
        while (numbers[l]+numbers[r]!=target){
            if (r!=numbers.length-1){
                r++;
            } else {
                l+=1;
                r = l+1;
            }
        }
        return new int[]{l+1, r+1};
    }
}
