package Task_9;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratingOverCollections {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList with the specified elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Step 2: Iterate using a for-each loop
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Step 3: Iterate using a traditional for loop with an index
        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Step 4: Iterate using an Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Step 5: Iterate using forEach method with a lambda expression
        System.out.println("\nUsing forEach with lambda expression:");
        fruits.forEach(fruit -> System.out.println(fruit));

        // Step 6: Iterate using a method reference
        System.out.println("\nUsing forEach with method reference:");
        fruits.forEach(System.out::println);
    }
}