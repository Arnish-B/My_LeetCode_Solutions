class Solution {
    public int lengthOfLastWord(String s) {
        int len =0;
        String arr[] = s.split(" ");
        System.out.println(arr[arr.length-1]);
        return arr[arr.length-1].length();
        
    }
}