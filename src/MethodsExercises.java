import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Addition(5, 100);
        Subtraction(7, 8);
        Multiplication(5, 5);
        Division(45, 5);

//        getInteger(1, 10);
//        System.out.println(MethodsExercises.getInteger(1, 10));

        factoral(1, 10);
        System.out.println(MethodsExercises.factoral(1, 10));

    }

    public static void Addition(int a, int b) {
        System.out.println(a + b);
    }

    public static void Subtraction(int a, int b) {
        System.out.println(a - b);
    }

    public static void Multiplication(int a, int b) {
        System.out.println(a * b);
    }

    public static void Division(int a, int b) {
        System.out.println(a / b);
    }

//    public static int getInteger(int min, int max) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number between 1 & 10: ");
//        int userInput = input.nextInt();
//
//        if (userInput < min || userInput > max) {
//            System.out.println("Enter a valid number between 1 & 10!");
//        } else {
//            System.out.println("Your number is: " + userInput);
//        }
//        return userInput;
//    }


//    public static int getInteger(int min, int max) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number between 1 & 10: ");
//        int userInput = input.nextInt();
//        if (userInput < min || userInput > max) {
//            System.out.println("Enter a valid number between 1 & 10!");
//            return getInteger(min, max);
//        } else {
//            System.out.println("Your number is: " + userInput);
//        }
//        return userInput;
//    }

    public static long factoral(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 & 10: ");
        long userInput = input.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("Enter a valid number between 1 & 10!");
            return factoral(min, max);
        } else {
            for (int i = 1; i <= max; i++) {
                userInput = userInput * min;
            }
            return userInput;
        }
    }
}
