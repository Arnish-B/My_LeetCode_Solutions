class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        if(intervals.length == 0){
            int[][] fin = {{newInterval[0],newInterval[1]}}; 
            return fin;
        }

        List<List<Integer>> li = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        int flag = 0;

        if(start <= intervals[0][0] && end >= intervals[intervals.length-1][1]){
            int[][] fin = {{start,end}};
            return fin;
        }

        if(intervals.length == 1){
            if(end < intervals[0][0]){
                int[][] fin = {{start,end},{intervals[0][0],intervals[0][1]}};
                return fin;
            }
            if(start <= intervals[0][0]){
                intervals[0][0] = start;
            }
            if(start > intervals[0][1]){
                int[][] fin = {{intervals[0][0],intervals[0][1]},{newInterval[0],newInterval[1]}}; 
                return fin;
            }

            if(end >= intervals[0][1]){
                intervals[0][1] = end;
            }
            return intervals;
        }

        if(start < intervals[0][0] && end > intervals[0][0]){
            intervals[0][0] = start;
        }


        for(int i =0;i<intervals.length;i++){

            if(i < intervals.length-1 && (start > intervals[i][1] && start < intervals[i+1][0]) && end > intervals[i][1] && end < intervals[i+1][0]){
                for(int j =0;j<intervals.length;j++){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(intervals[j][0]);
                    temp.add(intervals[j][1]);
                    li.add(temp);
                    if(j==i){
                        List<Integer> temp1 = new ArrayList<>();
                        temp1.add(start);
                        temp1.add(end);
                        li.add(temp1);
                    }                    
                }
                break;
            }

            if(i < intervals.length-1 && (start > intervals[i][1] && start < intervals[i+1][0])&& end > intervals[i+1][0]){
                intervals[i+1][0] = start;
            }
            if(start <= intervals[i][1] && flag == 0){
                for(int j =0;j<=i;j++){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(intervals[j][0]);
                    temp.add(intervals[j][1]);
                    li.add(temp);
                    flag =1;
                }
            }
            if(end<=intervals[i][0] || end<=intervals[i][1]){
                 for(int j = i;j<intervals.length;j++){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(intervals[j][0]);
                    temp.add(intervals[j][1]);
                    li.add(temp);
                    flag =1;
                }
                break;
            }
        }

        if(start > intervals[intervals.length - 1][1]){
            List<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            for(int i=0;i<intervals.length;i++){
                List<Integer> temp1 = new ArrayList<>();
                temp1.add(intervals[i][0]);
                temp1.add(intervals[i][1]);
                li.add(temp1);
            }
            li.add(temp);
        }

        for(int i =0;i<li.size();i++){
            if(start >= li.get(i).get(0) && start <= li.get(i).get(1)){
                li.get(i).remove(1);
                li.get(i).add(end);

                if(i<li.size()-1 && (li.get(i+1).get(0) <= li.get(i).get(1) || li.get(i).get(1) >= li.get(i+1).get(1))){
                    li.get(i).remove(1);
                    li.get(i).add(li.get(i+1).get(1));
                    li.remove(i+1);
                }
            }
            if(i<li.size()-1 && (li.get(i+1).get(0) <= li.get(i).get(1) || li.get(i).get(1) >= li.get(i+1).get(1))){
                // int max = Math.max( li.get(i).get(1), li.get(i+1).get(1) );
                    li.get(i).remove(1);
                    li.get(i).add(li.get(i+1).get(1));
                    li.remove(i+1);
                }
        }

        if(end < intervals[0][0]){
            List<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            li.add(0,temp);
        }

        int[][] fin = new int[li.size()][2];
        for(int i =0;i<li.size();i++){
            for(int j = 0;j<2;j++){
                fin[i][j]=li.get(i).get(j);
            }
        }        
        return fin;
    }
}