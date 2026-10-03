// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         String mixed = "";
//         int n = word1.length() + word2.length();
//         int c1 = 0;
//         int c2 = 0;
//         for (int i = 0; i < n; i++) {
//             if (c1 < word1.length()) {
//                 mixed += word1.charAt(c1);
//                 c1++;
//             }
//             if (c2 < word2.length()) {
//                 mixed += word2.charAt(c2);
//                 c2++;
//             }
//         }
//         return mixed;
//     }
// }
