package com.travis;

import java.util.Stack;

public class Q2 {

    static void push(Stack<Integer> stack) {
        for (int i = 4; i < 15; i++) {
            stack.push(i);
        }
        System.out.println(stack);
    }
    static void removeMid(Stack<Integer> stack){
        int x = stack.size();
        stack.remove(x/2);
        System.out.println(stack);
    }
}
