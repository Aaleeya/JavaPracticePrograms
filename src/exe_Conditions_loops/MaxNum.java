package exe_Conditions_loops;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        //Max number in 2 numbers
        System.out.println("Enter num 1: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter num 2: ");
        int num2 = sc.nextInt();

        int max= Math.max(num1, num2);
        System.out.println("Max num is "+max);
    }
}
