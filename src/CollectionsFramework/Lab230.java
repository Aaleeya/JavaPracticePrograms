package CollectionsFramework;

public class Lab230 {
    public static void main(String[] args) {
        //How to create an array
        int[] arr = new int[5];
        //length of array ->5
        //Index starts from 0 to 4
        System.out.println(arr.length);

        //Fixed size problem in Array
        //Can I increase the size of array?-> No
        //We can do arr = new int[10] -->but this creates second object at runtime
        //Also there are not many methods available like we can't do arr.sort()
        //Array can store same type of element-homogenous
    }
}
