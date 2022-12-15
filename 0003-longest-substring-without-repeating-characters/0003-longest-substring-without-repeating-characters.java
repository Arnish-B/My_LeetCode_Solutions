class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl = 1;
        int k = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        if(s.length() == 0){
            return 0;
        }
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(mp.containsKey(ch) == false){
                mp.put(ch,1);
                if(mp.size() >= maxl){
                    maxl = mp.size();
                }
            }
            else{
                if(mp.size() >= maxl){
                    maxl = mp.size();
                }
                while(true){
                    if(s.charAt(k) != ch){
                         mp.remove(s.charAt(k));
                         System.out.println(mp + " " + "here");
                        k++;
                    }
                    else{
                       k++;
                       System.out.println(mp);
                       break;
                    }
                }
            }
        }
        return maxl;
    }
}