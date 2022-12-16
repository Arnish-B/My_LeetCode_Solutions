class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1 == null || s2 == null) return false;
        if (s2.length() < s1.length()) return false;

        int[] table = new int[26];
        int[] table2 = new int[26];

        int s1Length = s1.length();
        int s2Length = s2.length();

        for (int i = 0; i < s1Length; i++) {
            table[s1.charAt(i) - 'a']++;
            table2[s2.charAt(i) - 'a']++;
        }

        for (int i = s1Length; i < s2Length; i++) {
            if (Arrays.equals(table, table2)) {
                return true;
            }
            table2[s2.charAt(i - s1Length) - 'a']--;
            table2[s2.charAt(i) - 'a']++;
        }

        return Arrays.equals(table, table2);
        
    }
}