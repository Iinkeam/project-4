package part2_simple_dialog;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            System.out.print("Please enter a word: ");
            String input = scanner.nextLine();
            System.out.println("You entered: " + input.toUpperCase());

            System.out.println("Do you want to proceed? (Y/N): ");
            answer = scanner.nextLine();
            System.out.println();
        } while (answer.equalsIgnoreCase("y"));
    }
}
