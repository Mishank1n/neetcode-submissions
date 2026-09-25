class Solution {
    public static int removeDuplicates(int[] nums) {
         int index = 0;
         int nax = 1;
         int k = 1;
         while (index<nums.length && nax<nums.length){
             if (nums[index]==nums[nax]){
                 nax++;
             } else {
                 nums[index+1] = nums[nax];
                 k++;
                 index++;
                 nax++;
             }
         }
         return k;
    }
}