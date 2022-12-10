/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int mid,start = 1,end = n;
        int fin = 1;
        
        while(start <= end){
            mid = start + (end - start)/2;
            if(isBadVersion(mid) == false && isBadVersion(mid+1) == true){
                fin = mid + 1;
                break;
            }
            if(isBadVersion(mid) == true){
                end = mid-1;
            }
            else if(isBadVersion(mid) == false){
                start = mid + 1;
            }
        }
        
        return fin;
              
    }
}