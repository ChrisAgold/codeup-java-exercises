import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.",pi);
        Scanner scanner = new Scanner(System.in);
//        // Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        int integer;
//        System.out.print("Enter an integer: ");
//        integer = scanner.nextInt();
//        System.out.println("You entered: --> \"" + integer + "\" <--");
        // or can output using
        // System.out.printf("Your number is %d", integer);


        // Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        System.out.print("Enter 3 words: ");
//        String strings = scanner.nextLine();
//        System.out.println("You entered: --> \"" + strings + "\" <--");
        // Solution
//        System.out.println("Enter 3 words: ");
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        String str3 = scanner.next();
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//        System.out.println();

        // Send greeting to user
//        String greet = "Hello there";
//        String name = "Sam";
//        System.out.printf("%s, %s!%n",greet,name);

        // Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to          the user.
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println("You entered: --> \"" + sentence + "\" <--");

        // Prompt the user to enter values of length and width of a classroom at Codeup.
        //Use the nextLine method to get user input and parse the resulting string to a numeric type.
        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.
        System.out.println("Enter your classroom's length: ex. 12.5");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter your classroom's width: ex. 10.3");
        double width = Double.parseDouble(scanner.nextLine());

        // Calc Area
        System.out.printf("Area of the classroom: %.1f ft^2%n", length*width);
        System.out.printf("Perimeter of the classroom: %.1f ft%n", (2*length + 2*width));
    }
}
