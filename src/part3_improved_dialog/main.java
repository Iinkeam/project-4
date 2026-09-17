package part3_improved_dialog;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            System.out.print("Please enter a word: ");
            String userInput = scanner.nextLine();

            System.out.print("Reversed: ");
            for (int a = userInput.length() - 1; a >= 0; a--) {
                char b = userInput.charAt(a);
                System.out.print(b);
            }
            System.out.println();

            System.out.print("Do you want to proceed? (Y/N): ");
            answer = scanner.nextLine();
            System.out.println();

        } while (answer.equalsIgnoreCase("y"));
}
}