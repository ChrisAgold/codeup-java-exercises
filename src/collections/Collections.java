package collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts
        //   add light, medium, medium, dark to the array list, one at a time
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light"); // similar to JS ".push"
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

        System.out.println(roasts); // [light, medium, medium, dark]


        // 2. Check to see if the list contains "dark" , and then "espresso"
        boolean result;
        result = roasts.contains("dark");
        System.out.println(result ? "Contains dark!" : "Does not contain dark!");
        result = roasts.contains("expresso");
        System.out.println(result ? "Contains expresso" : "Does not contain expresso");

        // 3. Find the last index of "medium" in the array
        int index = roasts.lastIndexOf("medium");
        System.out.println("the last index of medium is " + index);

        // 4. Check if the array list is empty
        if (roasts.isEmpty()) {
            System.out.println("The roast list is empty");
        } else {
            System.out.println("The roast is not empty!");
        }

        // 5. Assign the array list an empty ArrayList object, and then check if empty
        roasts = new ArrayList<>();;
        System.out.println(roasts.isEmpty() ? "02 List is empty" : "02 List is NOT empty");

        // 6. Remove the espresso roast
        roasts.add("light");
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        roasts.add("espresso");
        System.out.println("Original roast: " + roasts);

        roasts.remove("espresso");
        System.out.println("Roast now looks like this: " + roasts);

        //  Remove every instance of "light"
        boolean keepGoing = roasts.contains("light");
        while (keepGoing) {
            if(roasts.contains("light")) {
                roasts.remove("light");
            } else {
                keepGoing = false;
            }
        }
        System.out.println("After the light removal, roast: " + roasts);

        // 7. Remove the element at index 2
        roasts.remove(2);
        System.out.println("After removing index 2, roast = " + roasts);

        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name
        //   b. Github username
        // 2. re-initialize the HashMap using the .clear() method
        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        // 4. use the .putIfAbsent() method t
        // o add
        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        // 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
        // 6. Use the .remove() method to remove "Casey"
        // 7. Use the .replace() method to change Vivian's username to "viviancandev"
        // 8. Use the .clear() method to clear the map
        // 9. Use the .isEmpty() method to verify that it was cleared

    }
}
