class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if(!(str1 + str2).equals(str2 + str1))
            return "";
        int gcdLength = gcd(len1, len2);
        return str1.substring(0, gcdLength);
    }
    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}