public class lc1963 {
    class Solution {
        public int minSwaps(String s) {
            int size = 0;
            int ans = 0;
            for(char c : s.toCharArray()){
                if(c == '('){
                    size++;
                }else{
                    size--;
                }
                ans = Math.max(ans,-size);
            }
            return (ans+1)/2;
        }
    }
}
