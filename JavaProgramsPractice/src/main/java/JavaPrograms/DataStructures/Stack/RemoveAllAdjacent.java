package JavaPrograms.DataStructures.Stack;

import java.util.Stack;
public class RemoveAllAdjacent {
    public static void main(String[] args) {

        String s = "caaabbbaacdddd";
        Stack<Character> stack = new Stack<>();
        char d = ' ';
        for(char c: s.toCharArray()){
            if(c==d) {
                continue;
            }
            if(stack.size()>0 && stack.peek()==c){
                d=stack.pop();
            }
            else {
                stack.push(c);
                d=' ';
            }
        }
        while(stack.size()>0){
            System.out.print(stack.pop()+ " ");
        }
    }
}
