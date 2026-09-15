import java.util.ArrayDeque;
import java.util.Deque;

public class lc946 {
    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Deque<Integer> st = new ArrayDeque<>();
            int idx=0;
            for(int i=0;i<pushed.length;i++){
                st.push(pushed[i]);
                while(!st.isEmpty() && popped[idx]==st.peek()){
                    st.pop();
                    idx++;
                }
            }
            return idx==popped.length;
        }
    }
}
