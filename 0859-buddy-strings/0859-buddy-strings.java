class Solution {
    public boolean buddyStrings(String s, String goal) {
       int freq1[] = new int[26];
       int freq2[] = new int[26];

       if(s.length()!=goal.length()){
           return false;
       }
       int diff = 0;
       for(int i = 0;i<s.length();i++){
           freq1[s.charAt(i) - 'a']++;
           freq2[goal.charAt(i) - 'a']++;
           if(s.charAt(i)!=goal.charAt(i)){
               diff+=1;
           }
       }
       boolean fin = false;
       for(int i =0;i<26;i++){
           if(freq1[i] != freq2[i]){
               return false;
           }
           if(freq1[i]>1){
               fin = true;
           }
       }
       if(diff == 2 || (diff == 0 && fin == true)){
           return true;
       }
        return false;
    }
}