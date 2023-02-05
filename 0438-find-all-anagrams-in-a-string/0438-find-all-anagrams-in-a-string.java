class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> fin = new ArrayList<>();
        int freq[] = new int[26];
        int l1 = s.length();
        int l2 = p.length();
        frequency(p, freq);

        for(int i =0;i<l1 && i+l2<=l1;i++){
            String substr = s.substring(i,i+l2);
            int subarr[] = new int[26];
            frequency(substr, subarr);
            if(same_Freq(subarr, freq)){
                fin.add(i);
            }
        }
        return fin;
    }

    private void frequency(String str, int[] charr){
        for(int i =0;i<str.length();i++){
            charr[str.charAt(i) - 'a']++;
        }
    }
    private boolean same_Freq(int[] ch1, int[] ch2){
        for(int i =0;i<26;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }

}