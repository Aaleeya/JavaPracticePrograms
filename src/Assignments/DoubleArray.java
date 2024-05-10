package Assignments;

public class DoubleArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            int[] arr2 = {arr1[i]*2};
            for (int j = 0; j < arr2.length; j++) {
                System.out.println(arr2[j]);
            }
        }
    }
}
