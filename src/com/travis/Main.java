package com.travis;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	try{
	    Stack<Integer> stack = new Stack<Integer>();
        Q1.push(stack);
        Q1.reverse(stack);
        Q2.push(stack);
        Q2.removeMid(stack);
    }
	catch(Exception e){
	    System.out.println("That didn't work");
    }

    }
}

