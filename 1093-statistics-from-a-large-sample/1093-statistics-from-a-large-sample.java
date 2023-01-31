class Solution {
    public double[] sampleStats(int[] count) {
        double fin[] = new double[5];
        int n = count.length;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i =0;i<n;i++){
            int temp = count[i];
            if(temp!=0){
                map.put(i,temp);
            }
        }
        Integer[] aKeys= map.keySet().toArray(new Integer[map.size()]);
        fin[0] = aKeys[0];
        fin[1] = aKeys[aKeys.length - 1];

       int totalCount = 0;
       long sum = 0;
        for (int i=0; i<n; i++) {
            if (count[i]!=0) {
                sum+=(i*(long)count[i]);
                totalCount+=count[i];
            }
        }
        fin[2] = sum/(double)totalCount;

        int mode_val = (Collections.max(map.values()));
        for(int i =0;i<aKeys.length;i++){
            if(map.get(aKeys[i]) == mode_val){
                fin[4] = aKeys[i];
                break;
            }
        }

        fin[3] = Median(count);
        return fin;
        
    }

    public static double Median(int[] count){
        int totalCount = 0;
        int n = count.length;
        for (int i=0; i<n; i++) {
            if (count[i]!=0) {
                totalCount+=count[i];
            }
        }
         int curCount = 0;
        int first = -1, second = -1;
        for (int i=0; i<n; i++) {
            if (count[i]!=0) {
                curCount+=count[i];
                if (totalCount%2==0) {
                    if (first == -1 && curCount>=totalCount/2) first = i;
                    if (curCount>=1+totalCount/2) {
                        second = i;
                        return (first+(double)second)/2;
                    }
                } else {
                    if (curCount>=(1+totalCount)/2) {
                        return (double)i;
                    }
                } 
            } 
        }
        return -1;
    }
}
