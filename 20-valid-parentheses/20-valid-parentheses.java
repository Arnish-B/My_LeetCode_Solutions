class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count =0;
        boolean fin = false;
        if(s.length()%2!=0){
            return false;
        }
        if(s.length() == 0){
            return false;
        }
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char t = s.charAt(i);
                if(t==')' && stack.peek()=='('){
                    stack.pop();
                    count+=1;
                    continue;
                }
                else if(t=='}' && stack.peek()=='{'){
                    stack.pop();
                    count+=1;
                    continue;
                }
                else if(t==']' && stack.peek()=='['){
                    stack.pop();
                    count+=1;
                    continue;
                }
                else{
                    fin = false;
                }
            }
            
            
        }
        if(count == s.length()/2){
            fin = true;
        }
        return fin;
    }
}