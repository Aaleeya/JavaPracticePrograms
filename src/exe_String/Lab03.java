package exe_String;

public class Lab03 {
    public static void main(String[] args) {
        /*There are 2 ways to create a String
        Both of them store the value in JVM in different way
        How they store value in JVM? -> Interview Q
         */

        String name ="Aaleeya"; // Assignment operator
        System.out.println("Your name is->"+name);

        //String name2 = new String("Aaleeya"); //New operator
        System.out.println("All functions available in String:");
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        //Primitive data types don't have any extra functionality

        //Strings are immutable,non-primitive data type in Java
        //Immutable - that can't be change-String gets stored in String constant pool in JVM
        //If value needs to be changed, don't use String, use StringBuilder or StringBuffer Class-API, Web Automation
        System.out.println(name);
        String name2 = name;
        System.out.println(name2);
    }
}
