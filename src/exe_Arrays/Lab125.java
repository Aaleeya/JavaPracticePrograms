package exe_Arrays;

public class Lab125 {
    public static void main(String[] args) {
        int[] a = new int[4];
        //defaults = a[0,0,0,0]
        a[3] = 90;
        a[5] = 1; //java.lang.ArrayIndexOutOfBoundsException
    }
}
