class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String mor[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        HashMap<Character, String> mp = new HashMap<>();
        List<String> li = new ArrayList<>();
        for(int i=0;i<26;i++){
            mp.put(alphabet[i],mor[i]);
        }
        String temp="";
        Set<String> fin = new HashSet<>();
        
        for(int i=0;i<words.length;i++){
            temp ="";
            for(int j=0;j<words[i].length();j++){                
                temp+=mp.get(words[i].charAt(j));
                // System.out.println(temp);
            }
            li.add(temp);
            fin.add(temp);
        }
        System.out.println(li);
        System.out.println(fin);
        return fin.size();
    }
}