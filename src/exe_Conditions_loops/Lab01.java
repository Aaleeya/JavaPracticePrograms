package exe_Conditions_loops;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //Even or odd number
        //int num = 11;

        //Take input from the user using Scanner class
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
       int num = sc.nextInt();

        if(num%2 ==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
        sc.close();
    }
}
