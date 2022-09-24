class Solution {
     public int jump(int[] nums) {
        int jumpCount = 0;
        int leftIdx = 0;
        int rightIdx = 0;

        while (rightIdx < nums.length - 1){
            int farthestIdx = 0;
            for (int i = leftIdx; i <= rightIdx; i++){
                farthestIdx = Math.max(farthestIdx, i + nums[i]);
            }
            leftIdx = rightIdx + 1;
            rightIdx = farthestIdx;
            jumpCount++;
        }

        return jumpCount;
    }
}