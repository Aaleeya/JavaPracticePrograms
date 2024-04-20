package exe_String;

public class Lab04 {
    public static void main(String[] args) {
        String name = "The Testing Academy";
        String name1 = "The Testing Academy"; //will create 1 string in string constant pool in JVM and assign both variables

        String name2= new String("The Testing Academy"); //Heap Area(OA)

        System.out.println(name == name1); //checks for reference, not the values(content), returns boolean
        System.out.println(name.equals(name1)); //compares 2 String(values)
        char c = name.charAt(0);
        System.out.println(c);
        boolean result = name.contains("x");
        System.out.println(result);
    }
}
