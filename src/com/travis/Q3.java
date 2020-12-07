package com.travis;

public class Q3 {

    public static void createMultiArray() {
        System.out.println("Q3 This is a Multi-Dimensional Array");
        int x = 4;
        int y = 4;
        int[][] mult = new int[x][y];
        int counter = 0;
        for(int i = 0; i < x; i ++) {
            mult[i][counter] = counter;
            System.out.println(mult[i][counter]);
            for (int p = 0; p < mult.length; p++) {
                mult[counter][p] = 3 + counter;
                System.out.println(mult[counter][p]);
            }
            ++counter;
        }
    }

    public static void multiplyArrayElements(int i, int i1){
        int multiply = i * i1;
        System.out.println(i + " " + "+" + " " + i1 + " " + "= " + multiply);
    }
    public static void passArrayIntoMethod(){
        int[] arr = new int[]{1,2,3,4,5,6,6,7,7,5,8,3,8,0,80};
        System.out.println("Q3 These are different elements of an array multiplied using a separate method");
        multiplyArrayElements(arr[5], arr[9]);
    }
    public static void cloneArray(){
        System.out.println("Q3 Here is an array");
        String[] virginia = {"Roanoke","Buena Vista","Lexington","Lynchburg"};
        String x = "Western ";
        for(int i = 0; i < virginia.length; i ++){
            System.out.println(virginia[i]);
        }
        System.out.println("Q3 Here is it's clone");
        for (String westernVirginia:virginia) {
            System.out.println(westernVirginia);
        }
    }

}
