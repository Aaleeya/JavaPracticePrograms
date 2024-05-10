package Assignments;

public class MaxNumber {
    //Write - Java method to find the maximum value in a 2D array. - O/P - 9
    //int[][] arr = {
    //{1, 2, 3},
    //{4, 5, 6},
    //{7, 8, 9}
    //};
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9} };
        int row= 3;
        int col=3;

        //initializing max element as min value
        int maxElement = Integer.MIN_VALUE;

        //Check each element of the matrix
        //if it is greater than maxElement
        //update maxElement
        //traverse the matrix using two nested loops, one for rows and one for columns, and find the maximum element
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] > maxElement){
                    maxElement = arr[i][j];
                }
            }
        }
        System.out.println("The max element in the 2 D array is: "+maxElement);
    }
}
