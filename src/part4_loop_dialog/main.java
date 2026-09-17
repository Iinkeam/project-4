package part4_loop_dialog;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            System.out.println("Hello! I'm a BOT-suggester!");
            System.out.print("What is your name?: ");
            String userName = scanner.nextLine();
            System.out.println("Nice to meet you " + userName);

            System.out.println("\nLet me suggest you a book!");
            System.out.println("Tell me your age...");
            int userAge = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\nNow tell me your favorite genre? (Horror/Thriller/Detective/Non-fiction)");
            String userGenre = scanner.nextLine();

            if (userAge >= 13 && userAge <= 16 && userGenre.equalsIgnoreCase("Detective")) {
                System.out.println("\nI recommend you 'The Hound of the Baskervilles' by Arthur Conan Doyle!");
            } else if (userAge >= 17 && userAge <= 25 && userGenre.equalsIgnoreCase("Non-fiction")) {
                System.out.println("\nI recommend you 'Atomic Habits' by James Clear!");
            } else if (userAge >= 13 && userAge <= 40 && userGenre.equalsIgnoreCase("Horror")) {
                System.out.println("\nI recommend you 'Coraline' by Neil Gaiman!");
            } else if (userAge >= 17 && userAge <= 40 && userGenre.equalsIgnoreCase("Thriller")) {
                System.out.println("\nI recommend you 'The Silent Patient' by Alex Michaelides!");
            } else {
                System.out.println("\nI don't have a perfect recommendation yet, but try exploring books in the "
                        + userGenre + " genre!");
            }
            System.out.println("");

            System.out.println("Do you want to proceed? (Y/N): ");
            answer = scanner.nextLine();
            System.out.println();
        } while (answer.equalsIgnoreCase("y"));
    }
}