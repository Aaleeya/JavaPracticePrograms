package exe_Conditions_loops;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter the arithmetic operator to apply: ");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+'-> System.out.println(num1+num2);
            case '-'-> System.out.println(num1-num2);
            case '*'-> System.out.println(num1*num2);
            case '/'-> System.out.println(num1/num2);
            case '%'-> System.out.println(num1 %num2);
            default -> System.out.println("Enter a valid arithmetic operator");
        }
        sc.close();
    }
}
