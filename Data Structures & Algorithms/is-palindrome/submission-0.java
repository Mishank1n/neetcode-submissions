class Solution {
    public static boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)){
                stringBuilder.append(Character.toLowerCase(ch));
            }
        }
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }
}