package Assignments;

public class Transpose2DArray {
    //Write a Java method to transpose a given 2D array.
    //{
    //{1,4,7} ,
    //{2,5,8} ,
    //{3,6,9}
    //}
    public static void main(String[] args) {
        int n = 3;
        int[][] arr1 = {    {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9} };

        int[][] arr2 = new int [n][n];

        //to store transpose of arr1[][] in arr2[][]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] =arr1[j][i];
            }
        }

        //Print the result
        System.out.println("Result is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr2[i][j]+ " ");
                System.out.print("\n");
        }
    }
}
