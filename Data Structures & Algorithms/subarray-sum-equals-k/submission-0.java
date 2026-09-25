class Solution {
    public static int subarraySum(int[] nums, int k) {
        int res = 0;
        int curSum = 0;
        Map<Integer, Integer> pref = new HashMap<>();
        pref.put(0, 1);

        for (int num : nums){
            curSum+=num;
            int diff = curSum-k;
            res+=pref.getOrDefault(diff, 0);
            pref.put(curSum, 1+pref.getOrDefault(curSum, 0));
        }

        return res;
    }
}