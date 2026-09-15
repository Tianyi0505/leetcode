import java.util.*;

public class lc71 {
    class Solution {
        public String simplifyPath(String path) {
            Deque<String> st = new ArrayDeque<>();
            String[] split = path.split("/");
            for(String s:split){
                if(s.isEmpty()||".".equals(s)){
                    continue;
                }
                if("..".equals(s)){
                    if(!st.isEmpty()){
                        st.removeLast();
                    }
                }else{
                    st.add(s);
                }
            }
            return "/"+ String.join("/",st);
        }
    }
}
