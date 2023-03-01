class Solution {
    public int divide(int end, int sor) {
        if(sor == 1){
            return end;
        }
        
        if(end == sor){
            return 1;
        }
        if(end == 0){
            return 0;
        }

        long ans = 0;
        int sign = ((end < 0) || (sor < 0)) ? -1 : 1;
        if(end < 0 && sor<0){
            sign = 1;
        }
        long dividend = end;
        long divisor = sor;
        
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if (divisor == 1){
            ans = dividend;
            if(ans > Integer.MAX_VALUE){
            ans = Integer.MAX_VALUE;
        }
        if(ans < Integer.MIN_VALUE){
            ans = Integer.MIN_VALUE;
        }
        if(sign == -1){
            return (int)ans *-1;
        }
        return (int)ans;
        }
        ans = (long) (Math.exp(Math.log(dividend) - Math.log(divisor)) + 0.0000000001);
        if(ans > Integer.MAX_VALUE){
            ans = Integer.MAX_VALUE;
        }
        if(ans < Integer.MIN_VALUE){
            ans = Integer.MIN_VALUE;
        }
        if(sign == -1){
            return (int)ans *-1;
        }
        return (int)ans;
    }
}