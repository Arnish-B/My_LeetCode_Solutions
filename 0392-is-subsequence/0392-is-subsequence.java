class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int a = 0;
        int flag = 0;
        for(int i = 0;i<t.length();i++){
            if(t.charAt(i) == s.charAt(a)){
                a++;
                if(a == s.length()){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0){
            return false;
        }
        else{
            return true;
        }
    }
}