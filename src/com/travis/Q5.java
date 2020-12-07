package com.travis;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q5 {
    static void addQueue(Queue<Integer> queue){
        for(int i = 0; i < 15; i++){
            queue.add(i);
        }
        System.out.println(queue);
    }
    static void swapFrontBack(Queue<Integer> queue){
        Queue<Integer> swapsy = new LinkedList<>();
        int half = queue.size()/2;
        for (int i = 0; i < half; i ++){
            int x = queue.peek();
            queue.remove();
            swapsy.add(x);
        }
        for(int i = 0; i < swapsy.size();) {
            int x = swapsy.remove();
            queue.add(x);
        }
        System.out.println(queue);
    }

}
