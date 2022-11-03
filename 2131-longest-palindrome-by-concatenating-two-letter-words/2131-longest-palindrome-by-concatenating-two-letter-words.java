// class Solution {
//     public int longestPalindrome(String[] words) {
//         Arrays.sort(words);
//         List<String> li = new ArrayList<>();
//         for(int i =0;i<words.length;i++){
//             li.add(words[i]);
//         }
//         int count = 0,rep=0;
//         char lt[] = new char[2];
        
//         while(){
            
//             lt[0] = li.get(i).charAt(0);
//             lt[1] = li.get(i).charAt(1);
            
//             if(lt[0] == lt[1]){
//                 rep += 2;
//                 li.remove(i);
//                 System.out.println(li);
//                 if(li.isEmpty()){
//                         break;
//                     }
//             }
//         }
        
//         for(int i =0;i<li.size();i++){
//             lt[0] = li.get(i).charAt(0);
//             lt[1] = li.get(i).charAt(1);
//             for(int j = li.size()-1;j>= 0; j--){
//                 if(li.get(j).charAt(0) == lt[1] && li.get(j).charAt(1) == lt[0]){
//                     if(j>i){
//                        li.remove(i);
//                        li.remove(j-1); 
//                     }
//                     else{
//                         li.remove(j);
//                         li.remove(i-1);
//                     }
                    
//                     count += 4;
//                     System.out.println(li);
//                     if(li.size() <= 1){
//                         break;
//                     }
//                 }
//             }
//         }
//         System.out.println(rep);
//         if(count >= 4){
//             count += rep;
//         }
//         else if(count == 0){
//             return 2;
//         }
//         return count;
//     }
// }



class Solution {
    public int longestPalindrome(String[] words) {
        int[][] counting = new int[26][26];
        int max = 0;
        for (String word : words) {
            int a = word.charAt(0) - 'a';
            int b = word.charAt(1) - 'a';
            if (counting[b][a] > 0) {
                max += 4;
                counting[b][a]--;
            } else {
                counting[a][b]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (counting[i][i] > 0) {
                max += 2;
                break;
            }
        }
        return max;
    }
}