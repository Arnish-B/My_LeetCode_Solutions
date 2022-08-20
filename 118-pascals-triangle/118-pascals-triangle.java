class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> gen = new ArrayList<>();    
        
        for(int i=1;i<numRows+1;i++)
            
        {
            System.out.println(gen);
            List<Integer> row=new ArrayList<Integer>();
            int a = 0;
            int b = 1;
            for(int j=0;j<i;j++)
            {
                if(j==0 || j==i-1)
                {
                    row.add(j,1);
                    
                }
                else
                {                    
                    int temp = (gen.get(i-2).get(a) + gen.get(i-2).get(b));
                    row.add(j,temp);
                    a++;
                    b++;
                }
            }
            gen.add(row);
        }
        
        return gen;
    }
}