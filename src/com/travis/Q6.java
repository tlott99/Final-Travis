package com.travis;

import java.util.LinkedList;
import java.util.Queue;

public class Q6 {
    static void combineAlphaAndOmega(){
        Queue<Integer> alpha = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            alpha.add(i);
        }
        System.out.println(alpha);
        Queue<Integer> omega = new LinkedList<>();
        for(int i = 0; i < 5; i++){
            omega.add(i);
        }
        System.out.println(omega);
        for(int i = 0; i < omega.size();) {
            alpha.add(omega.remove());
            System.out.println(alpha);
            System.out.println(omega);
        }
    }
}
