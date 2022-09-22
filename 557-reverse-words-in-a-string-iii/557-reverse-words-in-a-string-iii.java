class Solution {
    public String reverseWords(String s) {
        String s1="";
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                st.push(s.charAt(i));
            }
            else{
                
               
                while(!st.empty()){
                    s1 =s1 +st.pop();
                }
                 s1 = s1 +' ';
            }
        }
        
        if(st.empty()){return s1;}
        else{while(!st.empty()){
                    s1 =s1+ st.pop();}}
        
        return s1;
    }
}