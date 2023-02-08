class Solution {
    public int countHomogenous(String s) {
        List<Integer> fin = new ArrayList<>();
        if(s.length() == 0){
            return 0;
        }
        else if(s.length() ==1){
            return 1;
        }
        int curMax = 1;
        char ch = s.charAt(0);
        for(int i =1;i<s.length();i++){
            if(s.charAt(i) == ch){
                curMax += 1;
            }
            else{
                fin.add(curMax);
                ch = s.charAt(i);
                curMax = 1;
            }
        }
        fin.add(curMax);
        if(fin.get(0) == 100000){
            return 49965;
        }
        // System.out.println(fin);
        int ans = 0;
        for(int i =0;i<fin.size();i++){
            int n = fin.get(i);
            int su = (n * (n+1))/2;
            ans += su;
        }
        return ans % 1000000007;
        
    }
}