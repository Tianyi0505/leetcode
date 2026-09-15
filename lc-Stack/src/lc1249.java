import java.util.ArrayDeque;
import java.util.Deque;

public class lc1249 {
    class Solution {
        public String minRemoveToMakeValid(String S) {
            Deque<Integer> st = new ArrayDeque<>();
            char[] s = S.toCharArray();
            int idx = 0;
            StringBuilder sb = new StringBuilder();
            for (char c : s) {
                if (c == '(') {
                    st.push(idx);
                    sb.append(c);
                    idx++;
                } else if (c != ')') {
                    sb.append(c);
                    idx++;
                } else if (!st.isEmpty()) {
                    sb.append(c);
                    idx++;
                    st.pop();
                }
            }
            while (!st.isEmpty()) {
                sb.deleteCharAt(st.pop());
            }
            return sb.toString();
        }
    }
}
