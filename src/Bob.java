import java.util.Scanner;

public class Bob {
    public static void main(String[] args) { // PSVM TAB
        Scanner sc = new Scanner(System.in);
        String answer = "Sure?";
        String yell = "Whoa, chill out!";
        String empty = "Fine. Be that way!";
        String other = "Whatever.";

        System.out.println("Enter anything below for Bob to answer.");
        String input = sc.nextLine();
        if(input.endsWith("?")){
            System.out.println(answer);
        } else if(input.endsWith("!")) {
            System.out.println(yell);
        } else if(input.endsWith("")){
            System.out.println(empty);
        } else {
            System.out.println(other);
        }
    }
}
