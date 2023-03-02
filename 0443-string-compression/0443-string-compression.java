class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1){
            return 1;
        }
        int counter = 1;
        for(int i =1;i<chars.length;i++){
            if(chars[i]!=chars[i]){
                counter += 1;
            }
        }
        int temp = counter*2;
        // char chars[] = new char[chars.length];
        int pos = 0;
        chars[pos] = chars[0];
        pos ++;
        counter =1;
        for(int i =1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                counter += 1;
            }
            else{
                if(counter == 1){
                chars[pos] = chars[i];
                pos += 1;
                counter = 1;
                continue;
                }
                if(counter >= 10){
                String str = String.valueOf(counter);
                for(int j =0;j<str.length();j++){
                    chars[pos] = str.charAt(j);
                    pos += 1;
                }
                }
                else{
                chars[pos] = (char)(counter+'0');
                pos += 1;
                }
                chars[pos] = chars[i];
                pos += 1;
                counter = 1;
            }
        }
        if(counter >= 10){
                String str = String.valueOf(counter);
                for(int j =0;j<str.length();j++){
                    chars[pos] = str.charAt(j);
                    pos += 1;
                }
                pos -=1;
                }
        else if(counter != 1){
        chars[pos] = (char)(counter+'0');
        }
        else{
            pos -= 1;
        }
        // for(int i =0;i<pos+1;i++){
        //     System.out.print(chars[i] + " ");
        // }
        // pos -= 1;
        for(int i =0;i<pos+1;i++){
            chars[i] = chars[i];
        }
        return pos+1;
    }
}