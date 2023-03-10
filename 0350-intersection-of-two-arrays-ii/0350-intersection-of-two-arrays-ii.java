class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> fin = new ArrayList<>();
        int i =0;
        int j = 0;
        while(i < l1 && j < l2){
            if(nums1[i] > nums2[j]){
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                fin.add(nums1[i]);
                i++;
                j++;
            }
        }
        int f[] = new int[fin.size()];
        for(int a=0;a<fin.size();a++){
            f[a] = fin.get(a);
        }
        return f;
    }
}