package exe_Conditions_loops;

public class Lab03 {
    public static void main(String[] args) {
        int itemcode =003;
        switch(itemcode){
            case 001, 002, 003:
                System.out.println("It is Electronic gadget");
                break;
            case 004, 005,006:
                System.out.println("It is mechanical gadget");
                break;
               // case 007 -> System.out.println("It is a laptop");
            default:
                System.out.println("Not a gadget");
        }
        char ch = 'z';
        switch (ch){
            case 'a','e','i','o','u'-> System.out.println("Vowel");
            default-> System.out.println("Consonant");
        }

        char code = 'B';
        int val = switch(code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                System.out.println("invalid data");
                throw new IllegalStateException("Error");
        };
        System.out.println(val);
    }

}
