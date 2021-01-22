public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 6;
        System.out.println(myFavoriteNumber);

        // Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "I like java.";
        //System.out.println(myString);

        // Change your code to assign a character value to myString. What do you notice?
        //char myString = 'A';
        //System.out.println(myString);

        // Change your code to assign the value 3.14159 to myString. What happens?
        myString = "657";
        System.out.println(myString);

        // Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        // Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber = 2;
//        System.out.println(myNumber);

        // Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        myNumber = 123L;
//        System.out.println(myNumber);

//          Change your code to assign the value 123 to myNumber.
//        myNumber = 123;
//        System.out.println(myNumber);

        // Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        float myNumber = 3.14F;
        System.out.println(myNumber);
/*
         Copy and paste the following code blocks one at a time and execute them
          int x = 5;
        System.out.println(x++);
        System.out.println(x);
*/

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);


        // Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the           // following code is run?
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (Integer) o;
//        int three = (int) "three";

        // Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x += 5;
//        System.out.println(x);

        int x = 3;
        int y = 2;
        x /= y;
        x -= y;
        System.out.println(x);
        System.out.println(y);
    }
}