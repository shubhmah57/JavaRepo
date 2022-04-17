package JavaPrograms.DataStructures.Stack;

import java.util.Stack;

public class RemoveAdjacent {
    public static void main(String[] args) {
        String s = "abbbaca";
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && c == stack.peek())
                stack.pop();
            else stack.push(c);
        }

        System.out.println(stack);
    }
}
