package exe_Arrays;

public class Lab124 {
    public static void main(String[] args) {
        int[] ages = {27, 31, 32, 33, 34}; //Fixed elements

        int[] ages2 = new int[5]; //this is better way to initialize array
        //Case 2 -Here the default value of all elements will be ? 0
        ages[0] = 11;
        System.out.println(ages[0]);

        String[] breakfast_item = {"idli", "fruit", "pancakes", "tea", "waffle"};
        System.out.println(breakfast_item.length);
    }
}
