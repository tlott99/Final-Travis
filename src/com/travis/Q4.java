package com.travis;

import java.util.Stack;
import java.util.Queue;

public class Q4 {
    static void addQueue(Queue<Integer> queue){
        for(int i = 0; i < 5; i++){
            queue.add(i);
        }
        System.out.println("Q4 queue " + queue);
    }
    static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < queue.size();) {
            int x = queue.peek();
            queue.remove();
            stack.push(x);
        }
        for(int i = 0; i < stack.size();) {
           int x = stack.pop();
           queue.add(x);
        }
        System.out.println("Q4 queue reversed " + queue);
    }
}
