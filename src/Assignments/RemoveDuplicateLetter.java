package Assignments;

import java.util.Scanner;

public class RemoveDuplicateLetter {
    //Duplicate String - Hello World -> Helowrd
    public static void main(String[] args) {
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 ="";
        char c;
        for (int i = 0; i < s1.length(); i++) {
            c = s1.charAt(i); //assigns each character to c
            if (s2.indexOf(c)==-1){
                s2+=c;
            }
        }
        System.out.print(s2);
        sc.close();
    }
}
