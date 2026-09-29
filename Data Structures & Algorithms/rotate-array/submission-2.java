class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if (k==0){
            System.out.println(Arrays.toString(nums));
        }
        
        rotatePart(nums, 0, nums.length-1);
        rotatePart(nums, 0, k-1);
        rotatePart(nums, k, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public void rotatePart(int[] nums, int l, int r){
        while(l<=r){
            int cur = nums[l];
            nums[l] = nums[r];
            nums[r] = cur;
            l++;
            r--;
        }
    }
}