package Assignments.ATB6x;

public class Student {
    int student_id;
    String student_first_name;
    String student_last_name;
    String student_email;
    boolean attendance= false;

    void attend_lectures(){
        System.out.println("Student attends lecture");
    }

    void completes_assignment(){
        System.out.println("Student completes assignments");
    }

    boolean logs_attendance(boolean attendance){
        System.out.println("Student marks the attendance"+ attendance);
        return attendance;
    }
}
