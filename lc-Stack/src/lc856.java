public class lc856 {
    class Solution {
        private int i=0;
        public int scoreOfParentheses(String S) {
            char[] s = S.toCharArray();
            return f(s);
        }
        public int f(char[] s) {
            int score = 0;
            while(i<s.length){
                char c = s[i];
                i++;
                if(c=='('){
                    score += f(s);
                }else{
                    score = score==0?1:score*2;
                    return score;
                }
            }
            return score;
        }
    }
}
