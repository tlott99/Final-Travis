package com.travis;
import java.util.Stack;

public class Q1{

    static void push(Stack<Integer> stack) {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack);
    }

    static void reverse(Stack<Integer> stack){
        Stack<Integer> stack1 = new Stack<Integer>();
        for(int i = 0; i < 10; i ++){
            Integer y = (Integer) stack.pop();
            stack1.push(y);
        }
        System.out.println(stack1);
    }

}
