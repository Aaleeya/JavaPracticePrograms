package Assignments;

import java.util.Scanner;

public class PrintMarks {
    public static void main(String[] args) {
        int[] marks = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks :");
            int mark = sc.nextInt();
            marks[i] = mark;
            System.out.println(marks[i]);
        }
    }
}
