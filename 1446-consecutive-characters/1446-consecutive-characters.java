class Solution {
    public int maxPower(String s) {
        if(s.length() == 0){
            return 0;
        }
        else if(s.length() == 1){
            return 1;
        }
        int totalMax = 0;
        int curMax = 1;
        int ch = s.charAt(0);
        for(int i =1;i<s.length();i++){
            if(s.charAt(i) == ch){
                curMax +=1;
            }
            else{
                totalMax = Math.max(totalMax, curMax);
                ch = s.charAt(i);
                curMax = 1;
            }
        }
        totalMax = Math.max(totalMax, curMax);
        return totalMax;
        
    }
}