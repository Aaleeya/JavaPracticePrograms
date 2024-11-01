package exe_Arrays;

import java.util.Arrays;

public class Lab130 {
    public static void main(String[] args) {
        int[] arrA ={1,5, 6, 2, 9, 32, 0};
        int[] arrB ={1, 5, 6, 2, 9, 32};

        System.out.println(Arrays.binarySearch(arrA, 32));

        //Problems on Arrays
        //Print sum of elements in the array arrB
        int sum = 0;
        for (int i = 0; i < arrB.length; i++) {
            sum = sum + arrB[i];
        }
        System.out.println(sum);

        //Find largest element in the array arrA
        int ans = arrA[0];
        for(int i=1; i<arrA.length;i++){
            if(ans < arrA[i]){
                ans = arrA[i];
            }
        }
        System.out.println(ans);

        //another approach
        Arrays.sort(arrA);
        System.out.println(arrA[arrA.length-1]);
    }
}
