class Solution {
    public int majorityElement(int[] nums) {
        int num = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]){
                count++;
            } else if (count>1) {
                count--;
            } else {
                num = nums[i];
                count = 1;
            }
        }
        return num;
    }
}