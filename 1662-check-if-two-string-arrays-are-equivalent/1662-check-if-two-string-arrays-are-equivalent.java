class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for(String st: word1){
            str1 += st;
        }
        for(String st: word2){
            str2 += st;
        }
        if(str1.equals(str2)){
            return true;
        }
        else{
            return false;
        }
    }
}