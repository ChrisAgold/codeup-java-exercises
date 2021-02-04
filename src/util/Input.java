package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return getString("Please enter a string:");
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String answer = this.scanner.nextLine();
        return (answer.toLowerCase().equals("y") ||
                answer.toLowerCase().equals("yes"));
    }

    // INT
    public int getInt() {
        System.out.printf("Please enter an integer: %n");
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max) {
        while (true) {
            System.out.printf("Please enter an integer between %d & %d: %n", min, max);
            int answer = this.scanner.nextInt();
            if (answer >= min && answer <= max)
                return answer;
        }
    }

    // DOUBLE
    public double getDouble() {
        System.out.printf("Please enter a double: %n");
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        while (true) {
            double answer = this.scanner.nextDouble();
            if (answer >= min && answer <= max)
                return answer;
        }
    }

    public static void main(String[] args) {
        Input in = new Input();
    }


}
