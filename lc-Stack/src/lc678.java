import java.util.ArrayDeque;
import java.util.Deque;

public class lc678 {
    class Solution {
        public boolean checkValidString(String S) {
            Deque<Integer> lst = new ArrayDeque<>();
            Deque<Integer> xst = new ArrayDeque<>();
            char[] s = S.toCharArray();
            for (int i = 0; i < s.length; i++) {
                if(s[i]=='('){
                    lst.push(i);
                }else if(s[i]=='*'){
                    xst.push(i);
                }else{
                    if(!lst.isEmpty()){
                        lst.pop();
                    }else if(!xst.isEmpty()){
                        xst.pop();
                    }else{
                        return false;
                    }
                }
            }
            while(!lst.isEmpty() && !xst.isEmpty()){
                int l = lst.pop();
                int r = xst.pop();
                if(l>r){
                    return false;
                }
            }
            return lst.isEmpty();
        }
    }
}
