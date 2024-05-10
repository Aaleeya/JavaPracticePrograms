package exe_Arrays;

public class ElementisPresent {
    //Write a Java method to check if a given element exists in a 2D array. ( element =8) , true
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} };
        int row= 3;
        int col=3;

        //int element = 8;
        //traverse the matrix using two nested loops, one for rows and one for columns, and find the element 8
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] == 8){
                    System.out.println(true);
                }
                else{
                    System.out.println(false);
                }
            }
        }
    }
}
