class Solution {
    public String getHint(String secret, String guess) {
        if(secret.equals(guess)){
            return (secret.length() + "A0B" );
        }
        List<Character> li1 = new ArrayList<>();
        List<Character> li2 = new ArrayList<>();
        int freq1[] = new int[10];
        int freq2[] = new int[10];
        String fin = "";
        int bulls = 0;
        int cows = 0;
        for(int i =0;i<secret.length();i++){
            li1.add(secret.charAt(i));
        }
        for(int i =0;i<guess.length();i++){
            li2.add(guess.charAt(i));
        }
        int a = li1.size();
        for(int i =0;i<a;i++){
            if(li1.get(i) == li2.get(i)){
                bulls+=1;
                li1.remove(i);
                li2.remove(i);
                i--;
                a--;
            }
        }
        fin += bulls + "A";
        for(int i =0;i<li1.size();i++){
            freq1[li1.get(i)-48]++;
        }
        for(int i =0;i<li2.size();i++){
            freq2[li2.get(i)-48]++;
        }
        for(int i =0;i<freq1.length;i++){
            if(freq1[i]==0){
                continue;
            }
            if(freq1[i] <= freq2[i]) 
            {
                cows += freq1[i];
            }
            else{
                cows += freq2[i];
            }
        }
        // System.out.println(li1);
        // System.out.println(li2);
        fin += cows + "B";
        return fin;
    }
}