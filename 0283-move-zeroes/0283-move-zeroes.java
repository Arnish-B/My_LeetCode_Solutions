class Solution {
    public void moveZeroes(int[] nums) {
        // int end = nums.length - 1;
        // for(int i =0;i<end;i++){
        //     if(nums[i] == 0){
        //         for(int j = i;j<end;j++){
        //             nums[j] = nums[j+1];
        //         }
        //         for(int j=0;j<nums.length;j++){
        //             System.out.print(nums[j] + " ");
        //         }
        //         System.out.println();
        //         nums[end] = 0;
        //         end -=1;
        //     }
        // } 
        int pos = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pos] = nums[i];
                pos+=1;
            }
        }
        for(int i =pos;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}