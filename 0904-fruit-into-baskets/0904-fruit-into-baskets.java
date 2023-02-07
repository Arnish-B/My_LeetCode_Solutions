class Solution {
    public int totalFruit(int[] fruits) {
        List<Integer> li = new ArrayList<>();
        int fin = 0;
        int a = fruits[0];
        int b = fruits[0];
        for(int i =1;i<fruits.length;i++){
            if(fruits[i]!=a){
                b = fruits[i];
                break;
            }
        }
        if(b == fruits[0]){
            return fruits.length;
        }
        for(int i =0;i<fruits.length;i++){
            if(fruits[i] == a || fruits[i] == b){
                li.add(fruits[i]);
            }
            else{
                a = li.get(li.size() - 1);
                b = fruits[i];
                fin = Math.max(fin, li.size());
                li = update(li);
                li.add(b);
            }
        }
        fin = Math.max(li.size(), fin);
        System.out.println(li);
        return fin;
    }

    public List<Integer> update(List<Integer> li){
        int n = li.size() - 1;
        int val = li.get(n);
        int pos = -1;
        for(int i =n;i>=0;i--){
            if(li.get(i) != val){
                pos = i;
                li.subList(0, pos+1).clear();
                return li;
            }
        }
        return li;
    }
}