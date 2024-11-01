package exe_Arrays;

import java.util.Arrays;

public class Lab133 {
    public static void main(String[] args) {
        //search for an element in array and return it's index, if not found return -1
        int[] arr ={1, 5, 6, 2, 9, 32, 0};
        int search = 32;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search){
                System.out.println(i);
                flag = true;
            }
        }
        if(!flag){
            System.out.println(-1);
        }

        //Another approach
        System.out.println(Arrays.binarySearch(arr, 32));
    }
}
