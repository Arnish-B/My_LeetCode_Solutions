class Solution {
    public int tribonacci(int n) {
        List<Integer> li = new ArrayList<>();
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        for(int i =0;i<=n;i++){
        if(i==0){
            li.add(0);
        }
        else if(i==1){
            li.add(1);
        }
        else if(i==2){
            li.add(1);
        }
        else{
            li.add(li.get(i-1)+li.get(i-2)+li.get(i-3));
        }
        }
        return li.get(n);
    }
}