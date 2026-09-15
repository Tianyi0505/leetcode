public class lc1190 {
    class Solution {
        private int i=0;
        public String reverseParentheses(String s) {
            char[] S = s.toCharArray();
            return function(S);
        }
        public String function(char[] s) {
            StringBuilder sb = new StringBuilder();
            while(i<s.length){
                i++;
                if(s[i-1]=='('){
                    sb.append(function(s));
                }else if(s[i-1]==')'){
                    return sb.reverse().toString();
                }else {
                    sb.append(s[i-1]);
                }
            }
            return sb.toString();
        }
    }
}
