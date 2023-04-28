package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyListExample {

    // print the list of strings
    private static void printList(List<String> list) {
        System.out.print("[");
        for (String item: list) {
            System.out.print(item + ",");
        }
        System.out.println("]");
    }

    // How to use an iterator to iterate over the list
    private static void printListUsingIteratorExplicitly(List<String> list) {
        System.out.print("[");
        Iterator<String> iter = list.iterator();

        while(iter.hasNext()) {
            System.out.print(iter.next() + ",");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();
        // adding to the list
        cars.add("Toyota_Camry_2021");
        cars.add("Toyota_Camry_2020");
        cars.add("Ford_Edge_2020");
        cars.add("honda_accord_2020");
        cars.add("Ford_Edge_2021");
        cars.add("honda_accord_2020");

        printList(cars);
        // adding element at specific index
        cars.add(2, "Toyota_Camry_2019");
        printList(cars);
        // removing an element from list
        cars.remove("Toyota_Camry_2021");
        printList(cars);

        // get element from specific index in the list
        System.out.println(cars.get(2));
        // remove element from specific index in the list
        cars.remove(2);
        printList(cars);

        // to check if the list contains an element
        System.out.println(cars.contains("honda_accord_2019"));
        System.out.println(cars.contains("honda_accord_2020"));

        // to get index of an element in the list
        System.out.println(cars.indexOf("honda_accord_2020"));
        System.out.println(cars.lastIndexOf("honda_accord_2020"));
        System.out.println(cars.indexOf("honda_accord_2019"));

        // set method is used to replace an element in the list
        cars.set(1,"Toyota_Camry_2022");
        printListUsingIteratorExplicitly(cars);
    }
}
