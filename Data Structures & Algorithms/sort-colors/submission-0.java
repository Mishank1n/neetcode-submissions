class Solution {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Integer min = Arrays.stream(nums).min().getAsInt();
        Integer max = Arrays.stream(nums).max().getAsInt();
        for (int i = min; i <= max; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int n = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int k = 0;
            while (k<entry.getValue()){
                nums[n] = entry.getKey();
                n++;
                k++;
            }
        }
    }
}