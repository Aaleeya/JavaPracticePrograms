package Assignments;

import java.util.Scanner;

public class Leapyear {
    //To check if the year entered is a Leap year or not
    public static void main(String[] args) {
        System.out.println("Enter a year :");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean isLeapYear = ((year%4==0) && (year % 100 != 0) || (year % 400 == 0));

        if(isLeapYear){
            System.out.println(year+ " is a leap year");
        }
        else{
            System.out.println(year+ " is not a leap year");
        }
        sc.close();
    }
}
