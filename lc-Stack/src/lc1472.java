import java.util.ArrayDeque;
import java.util.Deque;

public class lc1472 {
    class BrowserHistory {
        Deque<String> f;
        Deque<String> b;
        String cur;

        public BrowserHistory(String homepage) {
            f = new ArrayDeque<>();
            b = new ArrayDeque<>();
            cur=homepage;
        }

        public void visit(String url) {
            while(!f.isEmpty()){
                f.pop();
            }
            b.push(cur);
            cur=url;
        }

        public String back(int steps) {
            while(steps-->0 && !b.isEmpty()){
                f.push(cur);
                cur = b.pop();
            }
            return cur;
        }

        public String forward(int steps) {
            while(steps-->0&& !f.isEmpty()){
                b.push(cur);
                cur = f.pop();
            }
            return cur;
        }
    }

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
}
