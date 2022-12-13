class Solution {
    public String reverseWords(String s) {
        char temp;
        int last;
        String str[] = s.split(" ");
        for(int i = 0;i<str.length;i++){
            last = str[i].length() - 1;
            StringBuffer st = new StringBuffer();
            st.append(str[i]);
            st.reverse();
            str[i] = st.toString();
        }
        String fin = "";
        for(int i = 0;i<str.length;i++){
            for(int j =0;j<str[i].length();j++){
                fin += str[i].charAt(j);
            }
            fin += " ";
        }
        return fin.trim();
    }
}