import java.util.Scanner;

public class RobustScanner_v2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How old are you? ");
        boolean ageEntered = console.hasNextInt();
        while (!ageEntered) {
            System.out.println("You didn't type a valid age (an integer).");
            System.out.print("How old are you? ");
            console.next();   // discard the non-integer token
            ageEntered = console.hasNextInt();  // check the next token
        }
        // if we get here, we know the user typed an integer
        int age = console.nextInt();
        System.out.println("Wow, " + age + " is old!");
    }
}
