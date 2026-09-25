class Solution {
    public static boolean hasDuplicate(int[] nums) {
        Set a = new HashSet<>();
        for (int i : nums) {
            if (a.contains(i)){
                return true;
            } else {
                a.add(i);
            }
        }
        return false;
    }
}