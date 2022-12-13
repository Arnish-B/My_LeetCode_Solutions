class Solution {
    public String reverseWords(String s) {
        // char temp;
        // int last;
        // String str[] = s.split(" ");
        // for(int i = 0;i<str.length;i++){
        //     last = str[i].length() - 1;
        //     StringBuffer st = new StringBuffer();
        //     st.append(str[i]);
        //     st.reverse();
        //     str[i] = st.toString();
        // }
        // String fin = "";
        // for(int i = 0;i<str.length;i++){
        //     for(int j =0;j<str[i].length();j++){
        //         fin += str[i].charAt(j);
        //     }
        //     fin += " ";
        // }
        // return fin.trim();
        String fin = "",temp="";
        for(int i =s.length()-1;i>=0;i--){
            temp += s.charAt(i);
        }
        System.out.println(temp);
        String arr[] = temp.split(" ");
        for(int i = arr.length-1;i>=0;i--){
            fin += arr[i] + " ";
        }
        return fin.trim();
    }
}