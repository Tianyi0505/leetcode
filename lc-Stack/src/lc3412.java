import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.function.IntFunction;

public class lc3412 {
    class Solution {
        public long calculateScore(String S) {
            long ans = 0;
            char[] s = S.toCharArray();
            Deque<Integer>[] st = new ArrayDeque[26];
            Arrays.setAll(st, value -> new ArrayDeque<>());
            for (int i = 0; i < s.length; i++) {
                int idx = 25-(s[i]-'a');
                if(!st[idx].isEmpty()){
                    ans+=i-st[idx].pop();
                }else{
                    st[s[i]-'a'].push(i);
                }
            }
            return ans;
        }
    }
}
