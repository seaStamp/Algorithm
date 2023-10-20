import java.util.Stack;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            } else {
               if(stack.size() < 1) {
                   return false;
               }
               else {
                stack.pop();
               }
            }
        }
        if(stack.size() == 0){
            return true;
        }else{
            return false;
        }

    }
}