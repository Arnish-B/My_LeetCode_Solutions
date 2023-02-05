class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[] = new int[26];
        for(int i =0;i<s.length();i++){
            freq[s.charAt(i) - 'a'] +=1;
        }
        for(int i =0;i<t.length();i++){
            if(freq[t.charAt(i) - 'a'] == 0){
                return false;
            }
            else{
                --freq[t.charAt(i) - 'a'];
            }
        }
        boolean allZeros = Arrays.stream(freq).allMatch(x -> x == 0);
        return allZeros;
    }
}