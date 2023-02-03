class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int row = numRows;
        int col = numRows + (s.length()/numRows);
        // System.out.println(col);
        char[][] fin = new char[row][s.length()];
        int a = 0;
        int b = 0;
        int pos = 0;
        while(pos < s.length()){
            char ch = s.charAt(pos);
            try{

            if(b%(row-1) == 0){
                fin[a][b] = ch;
                pos++;
                if(a == row -1){
                    ++b;
                    --a;
                    continue;
                }
                a += 1;
            }
             else{
                fin[a][b] = s.charAt(pos);
                ++pos;
                ++b;
                --a;         
            }
            }
            catch (Exception e){
                break;
            }
           
        }
        String f = "";
        // System.out.println(fin[0][]);
        for(int i =0;i<row;i++){
            for(int j = 0;j<s.length();j++){
                // System.out.print(fin[i][j] + " ");
                if(fin[i][j]!='\u0000'){
                f+=fin[i][j];
                }
            }
            // System.out.println();
        }
        // System.out.println(f);
        return f;
    }
}










