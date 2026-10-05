public class LC1678_GoalParserInterpretation {
    static class Solution {
        public String interpret(String command) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < command.length(); i++) {
                char ch = command.charAt(i);
                if (ch == 'G') {
                    sb.append('G');
                } else if (ch == '(' && command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i++;        // skip ')'
                } else if (ch == '(') {
                    sb.append("al");
                    i += 3;     // skip "al)"
                }
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.interpret("G()(al)"));        // Goal
        System.out.println(s.interpret("G()()()()(al)"));  // Gooooal
        System.out.println(s.interpret("(al)G(al)()()G")); // alGalooG
    }
}
