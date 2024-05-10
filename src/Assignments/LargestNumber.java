package Assignments;

import java.util.Scanner;

public class LargestNumber {
    //Largest in 3 numbers
    public static void main(String[] args) {
        System.out.println("Enter num1: ");
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();

        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter num3: ");
        int num3 = sc.nextInt();
        System.out.println("The 3 numbers entered are: "+num1 +" "+num2+" "+num3);

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 +" is the largest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 +" is the largest number");
        }else {
            System.out.println(num3 +" is the largest number");
        }
        sc.close();
    }
}
