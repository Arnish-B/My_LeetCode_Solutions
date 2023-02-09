// class Solution {
//     public long distinctNames(String[] ideas) {
//         Map<Character, Integer> fl = new HashMap<>();
//         Map<String, Integer> rl = new HashMap<>();
//         long maxLen = ideas.length;
//         maxLen = maxLen * (maxLen - 1);

//         for(int i =0;i<ideas.length;i++){
//             char ch = ideas[i].charAt(0);
//             String str = ideas[i].substring(1,ideas[i].length());

//             if(fl.containsKey(ch)){
//                 fl.put(ch, fl.get(ch)+1);
//             }
//             else{
//                 fl.put(ch, 1);
//             }

//             if(rl.containsKey(str)){
//                 rl.put(str, rl.get(str)+1);
//             }
//             else{
//                 rl.put(str, 1);
//             }
//         }
//         System.out.println(fl);
//         System.out.println(rl);

//         for(Map.Entry<Character,Integer> entry : fl.entrySet()){
//             int temp = entry.getValue() * (entry.getValue() - 1);
//             maxLen -= temp;
//         }

//         for(Map.Entry<String,Integer> entry : rl.entrySet()){
//             int temp = entry.getValue() * (entry.getValue() - 1);
//             maxLen -= temp;
//         }
//         System.out.println(maxLen);

//         return 0;
//     }
// }



class Solution {
    public long distinctNames(String[] ideas) {
        HashSet<String>[] splitt = new HashSet[26];
        for (int i = 0; i < 26; ++i) {
            splitt[i] = new HashSet<>();
        }
        for (String idea : ideas) {
            splitt[idea.charAt(0) - 'a'].add(idea.substring(1));
        }
        // for(int i =0;i<25;i++){
        //     System.out.println(splitt[i]);
        // }

        long fin = 0;
        for (int i = 0; i < 25; ++i) {
            for (int j = i + 1; j < 26; ++j) {
                
                long samee = 0;
                for (String x : splitt[i]) {
                    if (splitt[j].contains(x)) {
                        samee++;
                    }
                }
                fin += 2 * (splitt[i].size() - samee) * (splitt[j].size() - samee);
            }
        }
        
        return fin;
    }
}