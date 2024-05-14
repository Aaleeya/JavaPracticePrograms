package Assignments.ATB6x;

public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.student_first_name ="Ayesha";
        student1.student_last_name ="Test";
        student1.student_email="ayesha@abc.com";
        student1.attend_lectures();
        student1.completes_assignment();
        student1.logs_attendance(true);

        Student student2 = new Student();
        student2.student_first_name="Jennifer";
        student2.student_last_name="Test";
        student2.student_email="jen@abc.com";
        student2.completes_assignment();
        student2.logs_attendance(true);

        Student student3 = new Student();
        student3.student_first_name ="Gautam";
        student3.student_last_name ="Test";
        student3.student_email ="gautam@abc.com";
        student3.logs_attendance(true);
    }
}
