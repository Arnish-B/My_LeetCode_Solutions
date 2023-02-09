class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1){
            return 1;
        }
        int fin = 0;
        int max = 0;

        int lower[] = new int[26];
        int upper[] = new int[26];

        for(int i =0;i<s.length();i++){
            try{
                lower[s.charAt(i) - 'a']++;
            }
            catch(Exception e){
                upper[s.charAt(i) - 'A']++;
            }
        }

       for(int i =0;i<26;i++){
        //    System.out.println(upper[i] + " o " + lower[i]);
           if(lower[i]%2 == 0 && lower[i]!=0){
               fin += lower[i];
           }
           else{
               if(lower[i]%2!=0){
                   fin += lower[i] - 1;
               }
               max = Math.max(max, lower[i]);
           }
           if(upper[i]%2 == 0 && upper[i]!=0){
               fin += upper[i];
           }
           else{
               if(upper[i]%2!=0){
                   fin += upper[i] - 1;
               }
               
               max = Math.max(max, upper[i]);
           }
       }
        return fin+Math.min(1,max);
        
    }
}