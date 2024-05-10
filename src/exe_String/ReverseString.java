package exe_String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //Reverse a String without using any function or using for loop.
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        for (int i = s1.length()-1; i >=0 ; i--) {
            System.out.print(s1.charAt(i));
        }
        sc.close();
    }
}
