public class Solution {
    public boolean isValid(String s) {
        Set<Character> left = new HashSet<>(), right = new HashSet<>();
        left.add('(');
        left.add('{');
        left.add('[');
        HashMap<Character,Character> m = new HashMap<>();
        m.put('(',')');
        m.put('[',']');
        m.put('{','}');
/*        right.add(')');
        right.add('}');
        right.add(']');*/
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(left.contains(c)){
                stack.add(c);
            }
            else{
                if(stack.size()==0) return false;
                if(m.get(stack.pop()) != c){
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}