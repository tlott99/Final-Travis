
package com.travis;
import java.util.Stack;

public class Q1{

    static void push(Stack<Integer> stack) {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("Q1 stack " + stack);
    }

    static void reverse(Stack<Integer> stack){
        Stack<Integer> stack1 = new Stack<>();
        for(int i = 0; i < 10; i ++){
            Integer y = stack.pop();
            stack1.push(y);
        }
        System.out.println("Q1 reverse stack " + stack1);
    }

}