package exe_Arrays;

public class Lab127 {
    public static void main(String[] args) {
        // == ->Ref
        // .equals() ->value/content
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(arr1);
        System.out.println(arr2);

        System.out.println(arr1 ==arr2);
        System.out.println(arr1.equals(arr2)); //ref


    }
}
