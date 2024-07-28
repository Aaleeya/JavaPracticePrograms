package CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab232 {
    public static void main(String[] args) {
        //To use all functions like add, remove, clear, contains, indexOf, isEmpty, size, get
        //Also addAll, removeAll, containsAll

        List myList = new ArrayList(); //dynamic dispatch -polymorphism
        myList.add("Aaleeya");
        myList.add("Ayesha");
        myList.add("Gautam");
        myList.add("Aaleeya"); //duplicate
        System.out.println(myList);
        System.out.println(myList.size());

        myList.remove("Aaleeya");
        System.out.println(myList);

        System.out.println(myList.isEmpty());
        //myList.clear();
        //System.out.println(myList.isEmpty());
        System.out.println("----------------------");
        myList.add(235);
        myList.add(true);
        //How to print?
        for (int i = 0; i <myList.size() ; i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("_________________________");
        //for each loop
        for (Object list: myList){
            System.out.println(list);
        }

    }
}
