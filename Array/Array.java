package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // creating array
        // int marks[] = new int[50];
        // int number[] = {1, 2, 3};
        // int moreNumber[] = {4, 5, 6};
        // String fruits[] = {"apple", "prange", "mango"};
        // boolean arr[] = new boolean[2]; 

        // Input/output and update
         int marks[] = new int[50];

         Scanner sc = new Scanner(System.in);
        //  int phy;
        //  phy = sc.nextInt();

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); //che
        marks[2] = sc.nextInt();//math

        System.out.println("phy : " + marks[0]);
        System.out.println("che : " + marks[1]);
        
        marks[2] = marks[2] + 1;
        System.out.println("math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage = " + percentage + "%");

        // length of array

        System.out.println(marks.length);
    }
}
