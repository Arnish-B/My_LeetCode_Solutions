class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()){
            return false ;//if not then we return false ;
        }

        HashMap<Character , Character> hm = new HashMap<>();
        

        
        for(int i = 0 ; i <s.length() ; i++){
            if(hm.containsValue(t.charAt(i))){//this is important
            
                continue ;
            }else{
                hm.put(s.charAt(i),t.charAt(i));
            }
            
        }
        
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <s.length() ;i++){
            sb.append(hm.get(s.charAt(i)));
        }
        
        return(sb.toString().equals(t));
        
    }
}