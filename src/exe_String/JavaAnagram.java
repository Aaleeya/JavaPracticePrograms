package exe_String;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagram {
    public static void main(String[] args) {
        //Java Anagrams -to check whether the given strings are anagrams of each other or not
        // silent -> listen , length1 = length2,
        System.out.println("Enter String 1: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println("Enter String 2:");
        String s2 = sc.next();

        //Get lengths of both strings
        int n1 = s1.length();
        int n2 = s2.length();

        //Check if the length is same -If length of both string is not same, they cannot be anagram
        if(n1 != n2){
            System.out.println("Entered strings are not anagram of each other");
        }
        else{
            //convert string to array of characters
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();

            //Sort both char arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            //compare sorted strings- if the char arrays are the same then string is anagram
            boolean result = Arrays.equals(arr1,arr2);
            if(result){
                System.out.println(s1+" and "+ s2+" are anagram.");
            }
            else{
                System.out.println(s1+" and "+ s2+" are not anagram.");
            }
        }
        sc.close();
    }
}
