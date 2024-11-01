package CodingInterviewQs.Basic;

import java.util.Scanner;

public class MultiplicationTable {
    //Print lines of output; each line (where ) contains the of in the form:
    //N x i = result.
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a number between 1-100:");

        // Read a line of text entered by the user
        int num =sc.nextInt();

        for (int i = 1; i < 11; i++) {
            int result = num * i;
            System.out.println(num +" x "+ i +" = "+ result);
        }

        sc.close();

    }
}
