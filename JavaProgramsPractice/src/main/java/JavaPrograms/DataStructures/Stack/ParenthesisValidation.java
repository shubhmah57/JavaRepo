package JavaPrograms.DataStructures.Stack;

import java.util.Stack;

public class ParenthesisValidation {
    public static void main(String[] args) {
        String s = "[{{()}}(]";
        Stack<Character> parenthesisStack = new Stack<>();
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) =='{' || s.charAt(i)== '(' || s.charAt(i) == '['){
                parenthesisStack.push(s.charAt(i));
                continue;
            }
            if(s.charAt(i) == ')'){
                if(parenthesisStack.pop() == '('){
                    continue;
                }
                break;
            }
            if(s.charAt(i) == '}'){
                if(parenthesisStack.pop() == '{'){
                    continue;
                }
                break;
            }
            if(s.charAt(i) == ']'){
                if(parenthesisStack.pop() == '['){
                    continue;
                }
                break;
            }
        }
        if(parenthesisStack.size() == 0){
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }
    }
}
