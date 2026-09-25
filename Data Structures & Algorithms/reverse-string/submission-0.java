class Solution {
    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        while (l<r){
            char left = s[l];
            char right = s[r];
            s[l] = right;
            s[r] = left;
            l++;
            r--;
        }
    }
}