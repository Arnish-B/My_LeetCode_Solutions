// class Solution {
//     public int jump(int[] nums) {
//         int jumps = 0;
//         int pos = 0;
//         // System.out.println(nums[pos]);
//         // int newpos = 0;
//         while(pos < nums.length){
//             if(pos == nums.length -1){
//                 return jumps;
//             }
//             // System.out.println("Initial POS: " + pos);
//             int maxPos = pos + nums[pos];
//             // System.out.println("Max POS: " + maxPos);
//             if(maxPos >= nums.length || maxPos == nums.length - 1){
//                 return jumps + 1;
//             }
//             else{
//                 pos = update(nums, pos+1, maxPos);
//                 // System.out.println("New POS: " + pos);
//                 jumps += 1;
//             }
//         }
//         return jumps;
//     }

//     public int update(int[] nums, int pos, int maxPos){
//         int max = -1;
//         int newPos = -1;
//         for(int i =pos;i<=maxPos;i++){
//             if(nums[i] >= max){
//                 max = nums[i];
//                 newPos = i;
//                 // System.out.println(i + " " + newPos);
//             }
//         }
//         return newPos;
//     }
// }

class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int max = 0;
        int curr = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            max = Math.max(max , i + nums[i]);
            if(curr == i){
                curr = max;
                count++;
            }
            if(curr>nums.length-1){
                return count;
            }
        }
        return count;
    }
}