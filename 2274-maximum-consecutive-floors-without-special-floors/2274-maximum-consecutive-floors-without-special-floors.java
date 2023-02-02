class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int curMax = special[0] - bottom;
        for(int i=1;i<special.length;i++){
            curMax = Math.max(curMax,special[i] - special[i-1]-1);
        }
        curMax= Math.max(curMax, special[0] - bottom);
        curMax = Math.max(curMax, top - special[special.length-1]);
        return curMax;
    }
}