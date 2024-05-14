package Assignments.ATB6x;

public class Payment {
    int payment_id;
    String payment_name;
    String payment_mode;
    boolean status= false;

    void payment_check(String payment_name, String payment_mode){
        System.out.println("Checks if the payment details is valid or not");
    }


    boolean payment_status(String payment_mode, boolean status){
        return status;
    }
}
