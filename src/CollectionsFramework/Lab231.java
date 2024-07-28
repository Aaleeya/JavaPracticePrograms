package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab231 {
    public static void main(String[] args) {
        //Collection Framework-> How to store the elements
        //1.List Interface->ArrayList, LinkedList, Vector, Stack

       // List<String> list = new ArrayList<>();

        List shopping_list = List.of("Milk", "Cheese", "Butter","Cheese", "Bread");
        System.out.println(shopping_list);

        //length of list?
        System.out.println(shopping_list.size());
        System.out.println(shopping_list.get(0));
        System.out.println(shopping_list.indexOf("Cheese"));
        System.out.println(shopping_list.isEmpty());


        List marks = List.of(91, 94, 92, 98, 96);
        System.out.println(marks);
        System.out.println(marks.size());

        List diff_data_types = List.of("Aaleeya", true, 91);
        System.out.println(diff_data_types);
    }
}
