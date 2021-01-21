package syntax;

public class SyntaxLecture {
    public static void main(String[] args) {

        // ================== STATEMENTS (s-3)

        // Statements may be...
        // Declarations
        int number = 7; // = is just assignment in Java

        // keyboard shortcut for formatting code is CMD is cmd + option + L
        // Assignment expressions
        number = 7; // assign correct data type in java

        // Any use of ++ or --
        // pre-increment
        --number; // this will be decremented BEFORE it's evaluated
        System.out.println("The number's value after pre-decrementing is " + number);
        number++; // this will be incremented AFTER it's evaluated on this line
        System.out.println("The number's value after post-incrementing is " + number);

        System.out.println("Pre-decrementing " + number + " = " + (++number)); // number increases right NOW
        System.out.println("Post-incrementing " + number + " = " + (number++)); // number increases on next line
        // Now the number = 7
        System.out.println("Now, the number = " + number);

        // Method invocations
        Math.random(); // call the "random()" method, from the Math class // command(window key) + click on method to find it in source code

        // assign a random number to a variable
        // number = Math.random(); // does not work because Math.random() returns a 'double'
        double randomNumber = Math.random();

        // Object creation expressions


        // ================== COMMENTS (s-4)


//        see JavaDocTest in docs package


        // ================== DATA TYPES (s-5, 6, 7)


        // use the smallest type needed for the job

        // primitive types...

        byte age = -32;
        System.out.println(age);
        short minimumAnnualSalary = 15080;
        int distanceToSaturn = 1200000000;
        long numberOfHumanCells = 3000000000L; // L needed for compiler

        // access something at the index 1 of a database using longs
        // books[1L]

        System.out.println(numberOfHumanCells);
        float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
        System.out.println(lengthOfBacteriaInInches);
        double widthOfAtomInMeters = .00000000001;
        char seatingSection = 'M'; // must wrap in single quotes
        boolean everythingIsAwesome = false;

        // strings (not a primitive type)

        // reference type data refers to a location in memory, holding the contents of that variable
        String thisIsAString = "Hello";
        String anotherString = "Hello";
        if (thisIsAString.equals("Hello")) {
            System.out.println("We have a match for Hello using .equals");
        }


        // like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting
        System.out.println("Hello\nWorld"); // \n is for new line

        System.out.println("Hello");
        System.out.println("World");

        // want to system out "groovy", world
        System.out.println("Hello, \"groovy\" World");

        char someLetter = 'Y';
        System.out.println(someLetter);
        // ================== VARIABLES (s-8)

        // declaration separate from initialization
//        int faveNumber;
//        faveNumber = 42;
        // declaration and initialization
        int faveNumber = 42;

        // ================== IDENTIFIERS AND KEYWORDS (s-9)
        // String if = "Jonas"; // 'if' is a reserved word so it cannot be a variable name
        // see curriculum

        // ================== CONSTANTS (s-10)
        final double CIV_MAX_DOLLARS = 2147483647; // constants are names in ALL caps & cannot re-assign it a value
        // see curriculum


        // ================== EXPRESSIONS (s-11)

        // basically the same as JS
        int firstValue = 97;
        int secondValue = 99;

        int sumOfValues = firstValue + secondValue;
        int deltaValues = firstValue - secondValue;
        int product = firstValue * secondValue;
        int quotient = firstValue / secondValue;

        // ================== OPERATORS (s-12)
        int reverseNumber = -72;

        // basically the same as JS


        // ================== ASSIGNMENT STATEMENTS (s-13)

        // basically the same as JS


        // ================== CASTING (s-14)

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/


        // IMPLICIT
        short x = 8;
        int y = x;

        // EXPLICIT
        int civDollars = 20999999;
        byte civSandwitch = (byte) civDollars;
        System.out.println(civSandwitch);
        // implicit casting - less to more precise (widening)

        float num1 = 2.22F;
        double num2 = num1;

        // explicit casting - more to less explicit casting (narrowing)

        double num3 = 3.1;
        float num4 = (float) num3;

        System.out.println(num4);
    }
}

