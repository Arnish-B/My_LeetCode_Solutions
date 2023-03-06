class Solution {
    public int findKthPositive(int[] arr, int k) {
        int temp = 1;
        int pos = 0;
        ArrayList<Integer> li= new ArrayList<>();
        while(li.size() <= k){
            if(pos < arr.length && temp == arr[pos]){
                pos ++;
                temp ++;
                continue;
            }
            else{
                li.add(temp);
                temp ++;
            }
        }
        // System.out.println(li.get(k-1));
        return li.get(k-1);
    }
}