class Solution {
    public int[] evenOddBit(int n) {
        int fin[] = new int[2];
        fin[0] = 0;
        fin[1] = 0;
        String bin = Integer.toBinaryString(n);
        int pos = 0;
        for(int i =bin.length()-1;i>=0;i--){
            if(pos%2==0 && bin.charAt(i) == '1'){
                fin[0]+=1;
            }
            if(pos%2!=0 && bin.charAt(i) == '1'){
                fin[1]+=1;
            }
            pos+=1;
        }
        return fin;
    }
}