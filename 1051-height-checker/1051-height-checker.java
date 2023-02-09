class Solution {
    public int heightChecker(int[] heights) {
       int[] temp = heights.clone();
       Arrays.sort(temp);
       int count = 0;
       for(int i =0;i<temp.length;i++){
           if(temp[i]!=heights[i]){
               count += 1;
           }
       }
       return count;
    }
}