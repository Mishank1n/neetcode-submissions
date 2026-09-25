class Solution {
    public static int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        Integer min = Arrays.stream(nums).min().getAsInt();
        Integer max = Arrays.stream(nums).max().getAsInt();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] resList = new int[set.size()];
        int index = 0;
        for (int i = min; i <= max; i++) {
            if (set.contains(i)){
                resList[index] = i;
                index++;
            }
        }
        int len = 1;
        int maxLen = 1;
        for (int i = 0; i < resList.length-1; i++) {
            if (resList[i+1]-resList[i] == 1){
                len++;
                maxLen = Math.max(len, maxLen);
            } else {
                len = 1;
            }
        }
        return maxLen;
    }
}