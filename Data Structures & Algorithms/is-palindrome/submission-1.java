class Solution {
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        s = s.toLowerCase();
        while (l<r){
            char left = s.charAt(l);
            char right = s.charAt(r);
            if (!Character.isLetterOrDigit(left)){
                l++;
                continue;
            } if (!Character.isLetterOrDigit(right)){
                r--;
                continue;
            }
            if (left!=right){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
