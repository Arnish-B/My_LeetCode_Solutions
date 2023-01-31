class Solution {
//     public int bestTeamScore(int[] scores, int[] ages) {
//         sortAgesAndScores(ages, scores);
//         System.out.println("AGE: " + Arrays.toString(ages));
//         System.out.println("Scores: " + Arrays.toString(scores));
        
//         return 0;
//     }
//     static void sortAgesAndScores(int[] ages, int[] scores) {
//         List<Person> people = new ArrayList<>();
//         for (int i = 0; i < ages.length; i++) {
//             people.add(new Person(ages[i], scores[i]));
//         }
//         Collections.sort(people);
//         for (int i = 0; i < people.size(); i++) {
//             ages[i] = people.get(i).age;
//             scores[i] = people.get(i).score;
//         }
//     }
//     static class Person implements Comparable<Person> {
//         int age;
//         int score;

//         Person(int age, int score) {
//             this.age = age;
//             this.score = score;
//         }

//         @Override
//         public int compareTo(Person other) {
//             if (this.age != other.age) {
//                 return Integer.compare(this.age, other.age);
//             } else {
//                 return Integer.compare(this.score, other.score);
//             }
//         }
//     }
     public int bestTeamScore(int[] scores, int[] ages) {
         int n = ages.length;
         int candidates[][] = new int[n][2];
         
         for(int i =0;i<n;i++){
             candidates[i][0] = ages[i];
             candidates[i][1] = scores[i];
         }
         
         Arrays.sort(candidates, (a,b) -> a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
         int dp[] = new int[n];
         dp[0] = candidates[0][1];
         int max = dp[0];
         for(int i =0;i<n;i++){
             dp[i]=candidates[i][1];
             for(int j=0;j<i;j++){
                 if(candidates[j][1] <= candidates[i][1]){
                     dp[i] = Math.max(dp[i], candidates[i][1]+dp[j]);
                 }
             }
             max = Math.max(max,dp[i]);
         }
         return max;
         
     }
}














