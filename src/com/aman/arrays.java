package com.aman;

public class arrays {

    public static void main(String[] args) {
        // write your code here
        // java arrays
        int[] marks = {1, 2, 3, 4, 5};
        // this will print updated value for this array...
        marks[3] = 34;
        System.out.println(marks[3]);
        //classical technique for loop itration...
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

//            for (int value : marks) {
//                System.out.println("This is for each loop");

                int [][]matrix = {{1,2,3},{4,5,6}};
                System.out.println(matrix[0][1]);

                String [] cars = {"maruti","hundai"};
                for (String value : cars) {
                    System.out.println(value);
            }
        }
    }
}
