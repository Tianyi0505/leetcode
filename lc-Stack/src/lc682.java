import java.util.ArrayDeque;
import java.util.Deque;

public class lc682 {
    static void main() {

    }
    class Solution {
        public int calPoints(String[] operations) {
            int ans = 0;
            Deque<Integer> st = new ArrayDeque<>();
            for(String s:operations){
                switch (s) {
                    case "C" -> st.pop();
                    case "+" -> {
                        int score = st.pop();
                        int score2 = st.peek() + score;
                        st.push(score);
                        st.push(score2);
                    }
                    case "D" -> {
                        int score = st.peek();
                        st.push(score * 2);
                    }
                    default -> {
                        int x = Integer.parseInt(s);
                        st.push(x);
                    }
                }
            }
            for(int x:st){
                ans+=x;
            }
            return ans;
        }
    }
}
