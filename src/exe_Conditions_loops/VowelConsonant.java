package exe_Conditions_loops;

import java.util.Scanner;

public class VowelConsonant {
    //Check if the character is a vowel or a consonant
    public static void main(String[] args) {
        System.out.println("Enter a character : ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||

                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println(ch +" is a vowel");
        }
        else{
            System.out.println(ch +" is a consonant");
        }
    }
}
