package JavaPrograms.DataStructures.Stack;

import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {
        int []a = {5,6,3,1,12,1421};
        Stack<Integer> numbersStack = new Stack<>();
        for(int i: a){
            numbersStack.push(i);
        }
        while (numbersStack.size()>0){
            System.out.print(numbersStack.pop() +  " ");
        }
    }
}
